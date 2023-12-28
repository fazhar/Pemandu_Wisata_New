package com.myweb.pemanduwisata_view.activity

import android.content.Intent
import android.graphics.Color
import android.util.TypedValue
import android.view.LayoutInflater
import androidx.annotation.ColorInt
import androidx.lifecycle.lifecycleScope
import com.myweb.pemanduwisata_view.common.BaseActivity
import com.myweb.pemanduwisata_view.databinding.ActivityRegisterBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RegisterActivity : BaseActivity<ActivityRegisterBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityRegisterBinding
        get() = ActivityRegisterBinding::inflate

    override fun setupView(binding: ActivityRegisterBinding) {
        binding.tvRegister.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }

        binding.btnRegister.setOnClickListener {
            lifecycleScope.launch {
                appUtils.showLoading(this@RegisterActivity)
                delay(1500)
                Intent(this@RegisterActivity, LoginActivity::class.java).apply {
                    startActivity(this)
                    finish()
                }
                appUtils.dismissLoading()
                appUtils.showSnackBar(this@RegisterActivity, "Register successful")
            }
        }
    }

    override fun onResume() {
        matchStatusBar()
        super.onResume()
    }

    override fun onDestroy() {
        resetStatusBar()
        super.onDestroy()
    }

    private fun resetStatusBar() {
        val typedValue = TypedValue()
        theme.resolveAttribute(com.google.android.material.R.attr.colorPrimary, typedValue, true)
        @ColorInt val color = typedValue.data
        window.statusBarColor = color
    }

    private fun matchStatusBar() {
        window.statusBarColor = Color.WHITE
    }
}