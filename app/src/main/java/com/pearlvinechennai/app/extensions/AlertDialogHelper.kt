package com.pearlvinechennai.app.extensions

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface


//Will create the alert dialog with title and message using AlertDialog.Builder
fun Context.alert(
    title:String,
    message:String,
    dialogBuilder: AlertDialog.Builder.() -> Unit
) {
    AlertDialog.Builder(this)
        .apply {
            setTitle(title)
            setMessage(message)
            setCancelable(false)
            dialogBuilder()
            create()
            show()
        }
}

//Handle the negative button click of the dialog
fun AlertDialog.Builder.negativeButton(
    text: String = "Cancel",
    handleClick: (dialogInterface: DialogInterface) -> Unit = { it.dismiss() }
) {
    this.setNegativeButton(text) { dialogInterface, _ -> handleClick(dialogInterface) }
}

//Handle the positive button click of the dialog
fun AlertDialog.Builder.positiveButton(
    text: String = "Yes",
    handleClick: (dialogInterface: DialogInterface) -> Unit = { it.dismiss() }
) {
    this.setPositiveButton(text) { dialogInterface, _ -> handleClick(dialogInterface) }
}

//Handle the neutral button click of the dialog
fun AlertDialog.Builder.neutralButton(
    text: String = "OK",
    handleClick: (dialogInterface: DialogInterface) -> Unit = { it.dismiss() }
) {
    this.setNeutralButton(text) { dialogInterface, _ -> handleClick(dialogInterface) }
}