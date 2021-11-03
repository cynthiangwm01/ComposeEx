package com.example.composeex.data.remote.response_data.manufacturer_detail


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ManufacturerType(
    @SerializedName("Name")
    val name: String?
) : Serializable