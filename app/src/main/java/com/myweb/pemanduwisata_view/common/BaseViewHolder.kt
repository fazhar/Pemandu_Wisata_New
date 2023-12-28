package com.myweb.pemanduwisata_view.common

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/***
 * Created by kikiprayudi
 * on Tuesday, 14/03/23 16:00
 *
 */


class BaseViewHolder<VB : ViewBinding>(var binding: VB, val context: Context) : RecyclerView.ViewHolder(binding.root)