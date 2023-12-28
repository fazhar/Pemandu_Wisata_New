package com.myweb.pemanduwisata_view

import android.content.Intent
import android.view.LayoutInflater
import com.myweb.pemanduwisata_view.common.BaseActivity
import com.myweb.pemanduwisata_view.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity<ActivityLoginBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityLoginBinding
        get() = ActivityLoginBinding::inflate

    override fun setupView(binding: ActivityLoginBinding) {
        binding.btnLogin.setOnClickListener {
            Intent(this@LoginActivity, MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
    }
}