package com.example.composeex.presentation.manufacturer_detail

import com.example.composeex.data.remote.response_data.manufacturer_detail.ManufacturerDetailContent
import com.example.composeex.data.remote.response_data.manufacturers.ManufacturerContent
import com.example.composeex.domain.model.ManufacturerDetail
import com.example.composeex.domain.model.Manufacturers

data class ManufacturerDetailState(
    val isLoading: Boolean = false,
    val manufacturerDetail: ManufacturerDetail = ManufacturerDetail(
        listOf<ManufacturerDetailContent>(),
        null
    ),
    val error: String = ""
)