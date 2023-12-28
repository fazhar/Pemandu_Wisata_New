package com.myweb.pemanduwisata_view.common

import androidx.lifecycle.ViewModel
import com.myweb.pemanduwisata_view.networking.ApiInterface
import kotlinx.coroutines.Job
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

interface ViewModelState
abstract class BaseViewModel : ViewModel(), KoinComponent {
    val apiInterface by inject<ApiInterface>()
    val job: Job? = null

}

