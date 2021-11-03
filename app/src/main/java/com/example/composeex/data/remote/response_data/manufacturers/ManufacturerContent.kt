package com.example.composeex.data.remote.response_data.manufacturers


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ManufacturerContent(
    @SerializedName("Country")
    val country: String?,
    @SerializedName("Mfr_CommonName")
    val mfrCommonName: String?,
    @SerializedName("Mfr_ID")
    val mfrID: Int,
    @SerializedName("Mfr_Name")
    val mfrName: String?,
    @SerializedName("VehicleTypes")
    val vehicleTypes: List<VehicleType?>?
) : Serializable