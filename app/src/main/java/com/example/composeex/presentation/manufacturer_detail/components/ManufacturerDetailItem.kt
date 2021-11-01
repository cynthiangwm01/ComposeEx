package com.example.composeex.presentation.manufacturer_detail.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import com.example.composeex.data.remote.response_data.manufacturer_detail.ManufacturerDetailContent
import com.example.composeex.presentation.ui.theme.standardPagePadding


@Composable
fun ManufacturerDetailItem(
    manufacturerDetailContent: ManufacturerDetailContent?,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(standardPagePadding),
    ) {
        Text(
            text = "(${manufacturerDetailContent?.mfrID}) ${manufacturerDetailContent?.mfrCommonName} (${manufacturerDetailContent?.country})",
        )
        manufacturerDetailContent?.address?.let {
            Text(
                text = it,
                fontStyle = FontStyle.Italic,
            )
        }
        manufacturerDetailContent?.contactEmail?.let {
            Text(
                text = it,
                fontStyle = FontStyle.Italic,
            )
        }
    }

}