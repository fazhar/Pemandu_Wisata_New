package com.myweb.pemanduwisata_view.response

import com.myweb.pemanduwisata_view.modelmap.nearby.ModelResults
import com.google.gson.annotations.SerializedName



class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}