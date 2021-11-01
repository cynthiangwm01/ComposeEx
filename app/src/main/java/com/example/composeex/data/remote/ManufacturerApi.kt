package com.example.composeex.data.remote

import com.example.composeex.data.remote.response_data.manufacturer_detail.ManufacturerDetailResponseData
import com.example.composeex.data.remote.response_data.manufacturers.ManufacturersResponseData
import retrofit2.http.GET
import retrofit2.http.Path

interface ManufacturerApi {

    @GET("/api/vehicles/getallmanufacturers?format=json")
    suspend fun getManufacturers(): ManufacturersResponseData

    @GET("/api/vehicles/getManufacturerDetails/{manufacturerId}?format=json")
    suspend fun getManufactuerById(@Path("manufacturerId") manufacturerId: String): ManufacturerDetailResponseData
}