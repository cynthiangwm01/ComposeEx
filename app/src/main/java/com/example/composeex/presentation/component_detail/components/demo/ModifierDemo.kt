package com.example.composeex.presentation.component_detail.components.demo

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Modifier
 * 1. the function called in the modifier are applied sequentially, we can apply
 * the same function multiple times (e.g. multiple borders)
 */
@Composable
fun ModifierDemo() {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxHeight(0.5f)

            /**
             * Width vs requiredWidth:
             */
            .fillMaxWidth()
//            .width(600.dp)
//            .requiredWidth(600.dp)

            /**
             *   Padding: set All vs side by side
             */
            .padding(16.dp)
//            .padding(top= 8.dp)

            /**
             * Border
             */
            .border(5.dp, Color.DarkGray)
            .padding(50.dp)

            .border(5.dp, Color.Yellow)
            .padding(16.dp)

    ) {
        Text(
            "Hello",
            /**
             * Offset: offset not equals to margin. Offset will not affect other components
             * In this case, if offset = 0, "Hello" & "World" will overlap
             */
            /**
             * Offset: offset not equals to margin. Offset will not affect other components
             * In this case, if offset = 0, "Hello" & "World" will overlap
             */
//            Modifier.offset(50.dp, 20.dp)
//            Modifier.offset(0.dp, 20.dp)

        )

        Text(
            "World",
            modifier = Modifier
                .background(Color.Magenta)
                /**
                 * Clickable
                 */
                /**
                 * Clickable
                 */
                .clickable {
                    Log.d("DEBUG", "Clicked World")
                }
        )

        /**
         * Spacer = Empty component
         */
        Spacer(modifier = Modifier.height(50.dp))

        Text("!")
    }
}