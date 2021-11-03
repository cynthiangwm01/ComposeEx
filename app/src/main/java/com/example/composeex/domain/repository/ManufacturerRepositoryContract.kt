package com.example.composeex.domain.repository

import com.example.composeex.data.remote.response_data.manufacturer_detail.ManufacturerDetailResponseData
import com.example.composeex.data.remote.response_data.manufacturers.ManufacturersResponseData

interface ManufacturerRepositoryContract {
    suspend fun getManufacturers(): ManufacturersResponseData

    suspend fun getManufacturerDetailById(manufacturerId: String): ManufacturerDetailResponseData
}