package com.myweb.pemanduwisata_view.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BaseBottomSheetDialog<VB : ViewBinding, Navigator> : BottomSheetDialogFragment() {
    private var _binding: ViewBinding? = null
    abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> VB
    var runOnBinding = { binding: VB -> }
    protected var navigator: Navigator? = null
        private set

    @Suppress("UNCHECKED_CAST")
    protected val binding: VB
        get() = _binding as VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        super.onCreate(savedInstanceState)
        _binding = bindingInflater.invoke(layoutInflater, container, false)
        setupView(binding)
        runOnBinding(binding)
        return binding.root
    }

    fun setNavigator(navigator: Navigator) {
        this.navigator = navigator
    }

    abstract fun setupView(binding: VB)


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}