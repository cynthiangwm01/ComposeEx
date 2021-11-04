package com.example.composeex.presentation.component_detail.components.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 *  Column
1. column uses horizontalAlignment & verticalArrangement

2. size is not defined = wrap content, then no effect to
horizontalAlignment & verticalArrangement, as it is
talking about the components' alignment in between the column

3. SpaceBetween: max. available space between each item
4. SpaceEvenly: each height distance between each item is the same(including
the height between parent & first / last components)
5. SpaceAround: each height between each item is the same but the distance between
parent & first / last components are each item distance / 2
 */
@Composable
fun ColumnDemo() {
    Column(
        modifier = Modifier
//            .fillMaxSize()
//            .fillMaxSize(0.5f)
            .width(200.dp)
            .height(300.dp),
//            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text("Hello")
        Text("World")
        Text("!")
    }
}