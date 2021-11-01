package com.example.composeex.presentation.manufacturers.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import com.example.composeex.data.remote.response_data.manufacturers.ManufacturerContent
import com.example.composeex.presentation.ui.theme.standardPagePadding

@Composable
fun ManufacturersItem(
    manufacturerContent: ManufacturerContent?,
    onItemClicked: (ManufacturerContent?) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClicked(manufacturerContent) }
            .padding(standardPagePadding),
    ) {
        Text(
            text = "(${manufacturerContent?.mfrID}) ${manufacturerContent?.mfrCommonName} (${manufacturerContent?.country})",
        )
        manufacturerContent?.country?.let {
            Text(
                text = it,
                fontStyle = FontStyle.Italic,
            )
        }
        Text(
            text = "VehicleTypes: ${manufacturerContent?.vehicleTypes?.count()}",
            fontStyle = FontStyle.Italic,
        )
    }

}