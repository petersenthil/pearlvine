package com.pearlvinechennai.app.appcomponents.ui

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager


class RecyclerItemDecoration(spacing: Int) : RecyclerView.ItemDecoration() {
    private var spacing = 0
    private var displayMode = -1

    val HORIZONTAL = 0
    val VERTICAL = 1
    val GRID = 2
    val STAGGERED_GRID = 3

    init {
        this.spacing = spacing
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val position = parent.getChildViewHolder(view).adapterPosition
        val itemCount = state.itemCount
        val layoutManager = parent.layoutManager
        setSpacingForDirection(outRect, layoutManager, position, itemCount)
    }


    private fun setSpacingForDirection(
        outRect: Rect,
        layoutManager: RecyclerView.LayoutManager?,
        position: Int,
        itemCount: Int
    ) {

        // Resolve display mode automatically
        if (displayMode == -1) {
            displayMode = resolveDisplayMode(layoutManager)
        }
        when (displayMode) {
            HORIZONTAL -> {
                outRect.left = spacing
                outRect.right = if (position == itemCount - 1) spacing else 0
                outRect.top = spacing
                outRect.bottom = spacing
            }
            VERTICAL -> {
                outRect.left = spacing
                outRect.right = spacing
                outRect.top = spacing
                outRect.bottom = if (position == itemCount - 1) spacing else 0
            }
            GRID -> if (layoutManager is GridLayoutManager) {
                val spanCount = layoutManager.spanCount
                val column: Int = position % spanCount
                val rows = itemCount / spanCount

                outRect.left = spacing - column * spacing / spanCount
                outRect.right = (column + 1) * spacing / spanCount
                outRect.top = spacing
                outRect.bottom = if (position / spanCount == rows - 1) spacing else 0
            }
            STAGGERED_GRID -> if (layoutManager is StaggeredGridLayoutManager) {
                val spanCount = layoutManager.spanCount
                val column: Int = position % spanCount
                val rows = itemCount / spanCount

                outRect.left = spacing - column * spacing / spanCount
                outRect.right = (column + 1) * spacing / spanCount
                outRect.top = spacing
                outRect.bottom = if (position / spanCount == rows - 1) spacing else 0
            }
        }
    }

    private fun resolveDisplayMode(layoutManager: RecyclerView.LayoutManager?): Int {
        return when (layoutManager) {
            is GridLayoutManager -> GRID
            is StaggeredGridLayoutManager -> STAGGERED_GRID
            else -> {
                if (layoutManager!!.canScrollHorizontally()) HORIZONTAL else VERTICAL
            }
        }
    }
}