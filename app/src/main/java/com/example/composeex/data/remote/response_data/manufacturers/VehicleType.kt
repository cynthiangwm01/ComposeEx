package com.example.composeex.data.remote.response_data.manufacturers


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class VehicleType(
    @SerializedName("IsPrimary")
    val isPrimary: Boolean?,
    @SerializedName("Name")
    val name: String?
) : Serializable