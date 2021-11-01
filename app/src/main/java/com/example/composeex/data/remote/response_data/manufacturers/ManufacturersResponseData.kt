package com.example.composeex.data.remote.response_data.manufacturers


import com.example.composeex.domain.model.Manufacturers
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ManufacturersResponseData(
    @SerializedName("Count")
    val count: Int,
    @SerializedName("Message")
    val message: String,
    @SerializedName("Results")
    val listResults: List<ManufacturerContent?>?,
    @SerializedName("SearchCriteria")
    val searchCriteria: Any?
) : Serializable

fun ManufacturersResponseData.toManufacturers(): Manufacturers {
    return Manufacturers(
        count = count,
        manufacturerContents = listResults,
    )
}