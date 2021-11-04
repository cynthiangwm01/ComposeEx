package com.example.composeex.presentation.component_detail.components.demo

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowDemo() {
    LazyRow {

        itemsIndexed(
            listOf("a", "b", "c", "d", "e", "f", "g")
        ) { index, item ->
            Text(
                text = "Item $index is $item",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(16.dp)
            )
        }

//        items(500) {
//            Text(
//                text = "Item $it",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(16.dp)
//            )
//        }
    }
}