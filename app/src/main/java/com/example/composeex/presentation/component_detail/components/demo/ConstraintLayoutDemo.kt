package com.example.composeex.presentation.component_detail.components.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

@Composable
fun ConstraintLayoutDemo() {
    val constraints = ConstraintSet {
        val greenBox = createRefFor("greenBox")
        val redBox = createRefFor("redBox")
        val guideLine = createGuidelineFromTop(0.5f)

        constrain(greenBox) {
            top.linkTo(guideLine)
//            start.linkTo(parent.start)
            width = Dimension.value(50.dp)
        }

        constrain(redBox) {
            top.linkTo(parent.top)
//            start.linkTo(greenBox.end)
            width = Dimension.value(50.dp)
        }
        createHorizontalChain(greenBox, redBox, chainStyle = ChainStyle.Packed)
    }

    ConstraintLayout(
        constraints, modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(Color.Green)
                .layoutId("greenBox")
                .fillMaxHeight(0.5f)
        )

        Box(
            modifier = Modifier
                .background(Color.Red)
                .layoutId("redBox")
                .fillMaxHeight(0.5f)
        )

    }
}