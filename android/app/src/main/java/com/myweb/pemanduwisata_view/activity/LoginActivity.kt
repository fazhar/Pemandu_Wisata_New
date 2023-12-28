package com.myweb.pemanduwisata_view.activity

import android.content.Intent
import android.graphics.Color
import android.util.TypedValue
import android.view.LayoutInflater
import androidx.annotation.ColorInt
import androidx.lifecycle.lifecycleScope
import com.myweb.pemanduwisata_view.common.BaseActivity
import com.myweb.pemanduwisata_view.databinding.ActivityLoginBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginActivity : BaseActivity<ActivityLoginBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityLoginBinding
        get() = ActivityLoginBinding::inflate

    override fun setupView(binding: ActivityLoginBinding) {
        binding.tvRegister.setOnClickListener {
            Intent(this@LoginActivity, RegisterActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }

        binding.btnLogin.setOnClickListener {
            lifecycleScope.launch {
                appUtils.showLoading(this@LoginActivity)
                delay(1500)
                Intent(this@LoginActivity, HomeActivity::class.java).apply {
                    startActivity(this)
                    finish()
                }
                appUtils.dismissLoading()
                appUtils.showSnackBar(this@LoginActivity, "Logged in")
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