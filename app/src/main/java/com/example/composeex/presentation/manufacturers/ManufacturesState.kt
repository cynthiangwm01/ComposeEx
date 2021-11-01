package com.example.composeex.presentation.manufacturers

import com.example.composeex.data.remote.response_data.manufacturers.ManufacturerContent
import com.example.composeex.domain.model.Manufacturers

data class ManufacturesState(
    val isLoading: Boolean = false,
    val manufacturers: Manufacturers = Manufacturers(0, listOf<ManufacturerContent>()),
    val error: String = ""
)