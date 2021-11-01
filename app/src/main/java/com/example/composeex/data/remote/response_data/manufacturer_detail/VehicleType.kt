package com.example.composeex.data.remote.response_data.manufacturer_detail


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class VehicleType(
    @SerializedName("GVWRFrom")
    val gVWRFrom: String?,
    @SerializedName("GVWRTo")
    val gVWRTo: String?,
    @SerializedName("IsPrimary")
    val isPrimary: Boolean?,
    @SerializedName("Name")
    val name: String?
) : Serializable