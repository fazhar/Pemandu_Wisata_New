package com.myweb.pemanduwisata_view

import android.app.Activity
import android.content.Context
import android.content.res.Resources
import android.util.TypedValue
import com.google.android.material.snackbar.Snackbar
import kotlin.math.roundToInt


class AppUtils {
    private var loadingOverlay: LoadingDialog? = null
    fun showLoading(context: Context) {
        loadingOverlay = LoadingDialog(context)
        loadingOverlay?.apply {
            onBtnCancelClicked = {
                dismiss()
            }
            show()
        }
    }

    fun dismissLoading() {
        loadingOverlay?.apply {
            if (isShowing) {
                loadingOverlay?.dismiss()
            }
        }
    }



    fun showSnackBar(activity: Activity, message: String) {
        val snackBar: Snackbar = Snackbar
            .make(activity.window.decorView, message, Snackbar.LENGTH_SHORT)
        snackBar.show()
    }


}