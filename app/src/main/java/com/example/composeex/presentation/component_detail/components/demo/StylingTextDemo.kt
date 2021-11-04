package com.example.composeex.presentation.component_detail.components.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun StylingTextDemo(fontFamily: FontFamily) {
    /**
     * Box:
     * stacks every child on top of each other.
     */
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier.align(Alignment.TopCenter),
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Cyan,
                        fontSize = 50.sp,
//                        textDecoration = TextDecoration.None
                    )
                ) {
                    append("Try")
                }
                append(" Styling Text")
            },

            /**
             * Those without style in the builder will use the default style below
             */
            color = Color.Black,
            fontSize = 28.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
    }
}