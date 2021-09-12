@file:Suppress("unused")

package com.pearlvinechennai.app.extensions

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

/**
 * Add/Replace fragment into container
 * @param containerId    id of container where fragment will be added
 * @param fragment       fragment to add
 * @param bundle         data for fragment
 * @param tag            name of fragment to add
 * @param addToBackStack true if you want to add in back stack
 * @param add        Decide whether we need to add or replace fragment in Container.
 */
fun FragmentActivity.loadFragment(
    containerId: Int,
    fragment: Fragment?,
    bundle: Bundle? = null,
    tag: String? = null,
    addToBackStack: Boolean = false,
    add: Boolean = false
) {
    try {
        if (fragment == null) {
            return
        }
        if (bundle != null) {
            fragment.arguments = bundle
        }
        val ft = supportFragmentManager.beginTransaction()

        if (addToBackStack) {
            ft.addToBackStack(null)
        }
        if (!fragment.isAdded) {
            if (add) {
                ft.add(containerId, fragment, tag).commit()
            } else {
                ft.replace(containerId, fragment, tag).commit()
            }
        }
    } catch (e: IllegalStateException) {
        e.printStackTrace()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

/**
 * Remove added fragment from specific container id
 * @param containerId of frame layout
 */
fun FragmentActivity.removeFragmentFromContainer(containerId: Int) {
    supportFragmentManager.findFragmentById(containerId)?.let {
        val ft = supportFragmentManager.beginTransaction()
        ft.remove(it)
        ft.commit()
    }
}

/**
 * Removes all fragments from backstack
 */
fun FragmentActivity.removeAllFragmentsFromBackStack() {
    val fragmentManager: FragmentManager = supportFragmentManager
    val count: Int = fragmentManager.backStackEntryCount
    for (i in count downTo 0) {
        fragmentManager.popBackStackImmediate(
            null,
            FragmentManager.POP_BACK_STACK_INCLUSIVE
        )
    }
}

/**
 * Checks if specific fragment is in back stack
 * @param tag      of fragment to find
 * @return
 */
fun FragmentActivity.isFragmentInStack(tag: String?): Boolean {
    var inStack = false
    val fragmentManager = supportFragmentManager
    val fragment = fragmentManager.findFragmentByTag(tag)
    if (fragment != null) {
        inStack = true
    }
    return inStack
}

fun FragmentActivity.getFragmentByTag(tag: String?): Fragment? {
    val fragmentManager = supportFragmentManager
    val fragment = fragmentManager.findFragmentByTag(tag)
    if (fragment != null) return fragment
    return null
}


fun FragmentActivity.removeFragmentByTag(tag: String?) {
    val fragmentManager = supportFragmentManager
    val fragment = fragmentManager.findFragmentByTag(tag)
    if (fragment != null) fragmentManager.beginTransaction().remove(fragment).commit()
}