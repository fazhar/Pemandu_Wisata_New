package com.myweb.pemanduwisata_view.common

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import org.koin.core.component.KoinComponent

abstract class BaseFragment<T : ViewBinding> : Fragment(), KoinComponent {
    private var _binding: T? = null
    val binding get() = _binding!!
    abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> T
    lateinit var activity: BaseActivity<*>
    private lateinit var lifecycleOwner: LifecycleOwner

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        activity = requireActivity() as BaseActivity<*>
        lifecycleOwner = activity.lifecycleOwner
        _binding = bindingInflater.invoke(inflater, container, false)
        return requireNotNull(_binding).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeToUiEvent()
        subscribeToState()
        setupView(binding, savedInstanceState)
    }

    abstract fun setupView(binding: T, savedInstanceState: Bundle?)
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
    /**
     * Gets the bottom padding of a view.
     *
     * @param onLoaded A lambda function that receives the bottom padding value as an integer.
     *                 This function is called immediately with a default value of 0.
     *                 Override this function according to your needs.
     */
    open fun getBottomPadding(onLoaded: (Int) -> Unit) = onLoaded(0)

    fun Fragment.createActivityLauncher(onResult: (ActivityResult) -> Unit = {}): ActivityResultLauncher<Intent> {
        return registerForActivityResult(ActivityResultContracts.StartActivityForResult(), onResult)
    }

    abstract fun subscribeToUiEvent()
    open fun subscribeToState() = Unit
}