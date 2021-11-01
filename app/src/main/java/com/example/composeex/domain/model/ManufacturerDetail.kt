package com.example.composeex.domain.model

import com.example.composeex.data.remote.response_data.manufacturer_detail.ManufacturerDetailContent

data class ManufacturerDetail(
    val manufacturerDetailResults: List<ManufacturerDetailContent?>?,
    val searchCriteria: Any?
)