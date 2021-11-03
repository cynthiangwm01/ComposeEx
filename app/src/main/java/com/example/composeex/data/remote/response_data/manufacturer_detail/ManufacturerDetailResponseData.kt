package com.example.composeex.data.remote.response_data.manufacturer_detail


import com.example.composeex.domain.model.ManufacturerDetail
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ManufacturerDetailResponseData(
    @SerializedName("Count")
    val count: Int?,
    @SerializedName("Message")
    val message: String?,
    @SerializedName("Results")
    val manufacturerDetailResults: List<ManufacturerDetailContent?>?,
    @SerializedName("SearchCriteria")
    val searchCriteria: Any?
) : Serializable

fun ManufacturerDetailResponseData.toManufacturerDetail(): ManufacturerDetail {
    return ManufacturerDetail(
        manufacturerDetailResults = manufacturerDetailResults,
        searchCriteria = searchCriteria
    )
}