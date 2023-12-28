package com.myweb.pemanduwisata_view

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue
import kotlin.math.roundToInt

fun Number.pxToDp(context: Context): Int {
    return (this.toFloat() / context.resources.displayMetrics.density).roundToInt()
}

fun Number.dpToPx(context: Context): Int {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        context.resources.displayMetrics
    ).roundToInt()
}

fun Number.dpToPx(): Int {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    ).roundToInt()
}