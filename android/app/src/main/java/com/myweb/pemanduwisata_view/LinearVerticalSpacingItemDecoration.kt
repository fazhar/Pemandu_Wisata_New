package com.myweb.pemanduwisata_view

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * A custom RecyclerView.ItemDecoration for adding vertical spacing to items within a linear layout.
 *
 * @param top The top spacing applied to all items.
 * @param bottom The bottom spacing applied to all items.
 * @param left The left spacing applied to all items.
 * @param right The right spacing applied to all items.
 * @param topMost The additional top spacing applied to the topmost item. (Optional)
 * @param bottomMost The additional bottom spacing applied to the bottommost item. (Optional)
 */
class LinearVerticalSpacingItemDecoration(
    var top: Int = 0,
    var bottom: Int = 0,
    var left: Int = 0,
    var right: Int = 0,
    var topMost: Int? = null,
    var bottomMost: Int? = null
) : RecyclerView.ItemDecoration() {
    /**
     * Applies spacing to the given item view based on its position within the RecyclerView.
     *
     * @param outRect The Rect object to define the spacing for the item view.
     * @param view The current item view being decorated.
     * @param parent The parent RecyclerView.
     * @param state The current RecyclerView.State.
     */
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val adapter = parent.adapter
        adapter?.let {
            val position = parent.getChildLayoutPosition(view)
            outRect.left = left
            outRect.right = right
            outRect.top = top
            outRect.bottom = bottom

            if (position == adapter.itemCount - 1) {
                bottomMost?.let { outRect.bottom = it }
            }
            if (position == 0) {
                topMost?.let{
                    outRect.top = topMost as Int
                    topMost?.let { outRect.top = it }
                }
            }
        }
    }
}
