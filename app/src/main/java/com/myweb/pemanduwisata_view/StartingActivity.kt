package com.myweb.pemanduwisata_view

import android.content.Intent
import android.view.LayoutInflater
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.myweb.pemanduwisata_view.common.BaseActivity
import com.myweb.pemanduwisata_view.databinding.ActivitySplashBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StartingActivity : BaseActivity<ActivitySplashBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySplashBinding
        get() = ActivitySplashBinding::inflate

    override fun setupView(binding: ActivitySplashBinding) {
        binding.btnLogin.setOnClickListener {
            Intent(this, LoginActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.btnSignUp.setOnClickListener {
            Intent(this, RegisterActivity::class.java).apply {
                startActivity(this)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        lifecycleScope.launch {
            delay(2000)
            binding.groupNav.isVisible = true
        }
    }
}