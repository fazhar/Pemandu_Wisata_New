package com.myweb.pemanduwisata_view.modelmap.nearby


import com.google.gson.annotations.SerializedName
import java.io.Serializable



class ModelResults : Serializable {
    @SerializedName("geometry")
    lateinit var modelGeometry: ModelGeometry

    @SerializedName("name")
    lateinit var name: String

    @SerializedName("vicinity")
    lateinit var vicinity: String

    @SerializedName("place_id")
    lateinit var placeId: String

    @SerializedName("rating")
    var rating = 0.0

    @SerializedName("lat")
    var lat: Double = 0.0

    @SerializedName("lng")
    var lng: Double = 0.0
}