package com.example.composeex.data.repository

import com.example.composeex.data.remote.ManufacturerApi
import com.example.composeex.data.remote.response_data.manufacturer_detail.ManufacturerDetailResponseData
import com.example.composeex.data.remote.response_data.manufacturers.ManufacturersResponseData
import com.example.composeex.domain.repository.ManufacturerRepositoryContract
import javax.inject.Inject

class ManufacturerRepository @Inject constructor(
    private val api: ManufacturerApi
) : ManufacturerRepositoryContract {
    override suspend fun getManufacturers(): ManufacturersResponseData {
        return api.getManufacturers()
    }

    override suspend fun getManufacturerDetailById(manufacturerId: String): ManufacturerDetailResponseData {
        return api.getManufactuerById(manufacturerId)
    }


}