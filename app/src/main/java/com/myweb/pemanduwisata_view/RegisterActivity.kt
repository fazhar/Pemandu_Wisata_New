package com.myweb.pemanduwisata_view

import android.content.Intent
import android.view.LayoutInflater
import com.myweb.pemanduwisata_view.common.BaseActivity
import com.myweb.pemanduwisata_view.databinding.ActivityRegisterBinding

class RegisterActivity: BaseActivity<ActivityRegisterBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityRegisterBinding
        get() = ActivityRegisterBinding::inflate

    override fun setupView(binding: ActivityRegisterBinding) {
        binding.tvRegister.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
    }
}