package com.example.composeex.presentation.component_detail.components.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * Row
1. Row uses horizontalArrangement & verticalAlignment instead
2. CenterVertically is for Row while CenterHorizontally is for Column
3. Others are similar to Column
 */
@Composable
fun RowDemo() {
    Row(
        modifier = Modifier
            .fillMaxSize(),
//            .fillMaxSize(0.5f)
//            .width(200.dp)
//            .height(300.dp)
//            .background(Color.LightGray),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Hello")
        Text("World")
        Text("!")
    }
}