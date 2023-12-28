package com.myweb.pemanduwisata_view.activity

import android.view.LayoutInflater
import com.myweb.pemanduwisata_view.LinearVerticalSpacingItemDecoration
import com.myweb.pemanduwisata_view.R
import com.myweb.pemanduwisata_view.adapter.ItemMenu
import com.myweb.pemanduwisata_view.adapter.MenuAdapter
import com.myweb.pemanduwisata_view.common.BaseActivity
import com.myweb.pemanduwisata_view.databinding.ActivityHomeBinding
import com.myweb.pemanduwisata_view.dpToPx

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityHomeBinding
        get() = ActivityHomeBinding::inflate
    lateinit var menuAdapter: MenuAdapter

    override fun setupView(binding: ActivityHomeBinding) {
        setupMenu()
        binding.swipeRefresh.setOnRefreshListener {
            setupMenu()
            binding.swipeRefresh.isRefreshing = false
        }
    }

    fun setupMenu(){
        menuAdapter = MenuAdapter().apply {
            val menus = listOf(
                ItemMenu(
                    name = "Boating",
                    imgRes = R.mipmap.ic_boat_foreground
                ),
                ItemMenu(
                    name = "Walking",
                    imgRes = R.mipmap.ic_walk_foreground
                ),
                ItemMenu(
                    name = "Train",
                    imgRes = R.mipmap.ic_train_foreground
                ),
                ItemMenu(
                    name = "Bus",
                    imgRes = R.mipmap.ic_bus_foreground
                ),
                ItemMenu(
                    name = "Running",
                    imgRes = R.mipmap.ic_runner_foreground
                ),
            )
            addAll(menus)
            binding.rvMenu.adapter = this
        }
    }
}