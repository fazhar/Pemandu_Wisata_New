package com.myweb.pemanduwisata_view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import com.myweb.pemanduwisata_view.common.BaseAdapter
import com.myweb.pemanduwisata_view.databinding.ItemMenuCardBinding

class MenuAdapter : BaseAdapter<ItemMenuCardBinding, MenuAdapter.Navigator, ItemMenu>() {
    interface Navigator : BaseAdapter.Navigator

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> ItemMenuCardBinding
        get() = ItemMenuCardBinding::inflate

    override fun onLoadItem(
        binding: ItemMenuCardBinding,
        item: ItemMenu,
        position: Int,
        itemViewType: Int,
        context: Context
    ) {
        binding.tvName.text = item.name
        binding.imgHeader.setImageResource(item.imgRes)
    }
}

data class ItemMenu(
    val imgRes: Int,
    val name: String
)