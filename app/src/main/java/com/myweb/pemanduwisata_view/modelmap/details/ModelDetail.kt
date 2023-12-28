package com.myweb.pemanduwisata_view.modelmap.details

import com.google.gson.annotations.SerializedName
import com.myweb.pemanduwisata_view.modelmap.nearby.ModelGeometry


class ModelDetail {
    @SerializedName("geometry")
    lateinit var modelGeometry: ModelGeometry

    @SerializedName("opening_hours")
    lateinit var modelOpening: ModelOpening

    @SerializedName("name")
    lateinit var name: String

    @SerializedName("formatted_phone_number")
    lateinit var formatted_phone_number: String

    @SerializedName("rating")
    var rating = 0.0
}