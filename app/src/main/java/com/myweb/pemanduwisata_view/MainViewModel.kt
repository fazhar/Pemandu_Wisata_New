package com.myweb.pemanduwisata_view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.myweb.pemanduwisata_view.modelmap.details.ModelDetail
import com.myweb.pemanduwisata_view.modelmap.nearby.ModelResults
import com.myweb.pemanduwisata_view.networking.ApiClient
import com.myweb.pemanduwisata_view.response.ModelResultDetail
import com.myweb.pemanduwisata_view.response.ModelResultNearby
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.collections.ArrayList as ArrayList1


class MainViewModel : ViewModel() {

    private val modelResultsMutableLiveData = MutableLiveData<ArrayList1<ModelResults>>()
    private val modelDetailMutableLiveData = MutableLiveData<ModelDetail>()

    companion object {
        var strApiKey = "YOUR API KEY"
    }

    fun setMarkerLocation(strLocation: String) {
        val apiService = ApiClient.getClient()
        val call = apiService.getDataResult(strApiKey, "Tambal Ban", strLocation, "distance")
        call.enqueue(object : Callback<ModelResultNearby> {
            override fun onResponse(call: Call<ModelResultNearby>, response: Response<ModelResultNearby>) {
                if (!response.isSuccessful) {
                    Log.e("response", response.toString())
                } else if (response.body() != null) {

                }
            }

            override fun onFailure(call: Call<ModelResultNearby>, t: Throwable) {
                Log.e("failure", t.toString())
            }
        })
    }



    fun setDetailLocation(strPlaceID: String) {
        val apiService = ApiClient.getClient()
        val call = apiService.getDetailResult(strApiKey, strPlaceID)
        call.enqueue(object : Callback<ModelResultDetail> {
            override fun onResponse(call: Call<ModelResultDetail>, response: Response<ModelResultDetail>) {
                if (!response.isSuccessful) {
                    Log.e("response", response.toString())
                } else if (response.body() != null) {
                    modelDetailMutableLiveData.postValue(response.body()!!.modelDetail)
                }
            }

            override fun onFailure(call: Call<ModelResultDetail>, t: Throwable) {
                Log.e("failure", t.toString())
            }
        })
    }

    fun getMarkerLocation(): LiveData<ArrayList1<ModelResults>> = modelResultsMutableLiveData

    fun getDetailLocation(): LiveData<ModelDetail> = modelDetailMutableLiveData

}
