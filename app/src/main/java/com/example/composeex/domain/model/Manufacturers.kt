package com.example.composeex.domain.model

import com.example.composeex.data.remote.response_data.manufacturers.ManufacturerContent

data class Manufacturers(
    val count: Int,
    val manufacturerContents: List<ManufacturerContent?>?,
)
