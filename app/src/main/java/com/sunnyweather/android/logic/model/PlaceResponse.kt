package com.sunnyweather.android.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>){

    data class Place(val id: String, val location: Location, val place_id: String, val name: String,
                     @SerializedName("formatted_address") val address: String)

    data class Location(val lng: String, val lat: String)
}