package com.example.composeex.presentation.component_detail

import android.view.View
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.composeex.R
import com.example.composeex.common.Constants.ID_COLUMN
import com.example.composeex.common.Constants.ID_CONSTRAINT_LAYOUT
import com.example.composeex.common.Constants.ID_LAZY_COLUMN
import com.example.composeex.common.Constants.ID_LAZY_ROW
import com.example.composeex.common.Constants.ID_MODIFIER
import com.example.composeex.common.Constants.ID_ROW
import com.example.composeex.common.Constants.ID_SNACKBAR
import com.example.composeex.common.Constants.ID_STYLING_TEXT
import com.example.composeex.presentation.component_detail.components.demo.*
import com.example.composeex.presentation.component_detail.components.exercise.*
import com.example.composeex.presentation.ui.theme.standardPagePadding

@Composable
fun ComponentDetailScreen(id: Int) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.fillMaxHeight(0.5f)) {
            getDemoComposable(id)
        }

        Divider()

        Box(modifier = Modifier.fillMaxHeight(0.5f)) {
            getExComposable(id)
        }

    }
}

@Composable
fun getDemoComposable(id: Int) {

    val fontFamily = FontFamily(
        Font(R.font.comfortaa_light, FontWeight.Light),
        Font(R.font.comfortaa_regular, FontWeight.Normal),
        Font(R.font.comfortaa_medium, FontWeight.Medium),
        Font(R.font.comfortaa_semi_bold, FontWeight.SemiBold),
        Font(R.font.comfortaa_bold, FontWeight.Bold),
    )

    when (id) {
        ID_COLUMN -> ColumnDemo()

        ID_ROW -> {
            RowDemo()
        }
        ID_MODIFIER -> {
            ModifierDemo()
        }
        ID_STYLING_TEXT -> {
            StylingTextDemo(fontFamily = fontFamily)
        }
        ID_SNACKBAR -> {
            SnackBarDemo()
        }
        ID_LAZY_COLUMN -> {
            LazyColumnDemo()
        }
        ID_LAZY_ROW -> {
            LazyRowDemo()
        }
        ID_CONSTRAINT_LAYOUT -> {
            ConstraintLayoutDemo()
        }
        else -> {
            ColumnDemo()
        }
    }
}

@Composable
fun getExComposable(id: Int) {

    val fontFamily = FontFamily(
        Font(R.font.comfortaa_light, FontWeight.Light),
        Font(R.font.comfortaa_regular, FontWeight.Normal),
        Font(R.font.comfortaa_medium, FontWeight.Medium),
        Font(R.font.comfortaa_semi_bold, FontWeight.SemiBold),
        Font(R.font.comfortaa_bold, FontWeight.Bold),
    )

    when (id) {
        ID_COLUMN -> {
            ColumnEx()
        }
        ID_ROW -> {
            RowEx()
        }
        ID_MODIFIER -> {
            ModifierEx()
        }
        ID_STYLING_TEXT -> {
            StylingTextEx(fontFamily = fontFamily)
        }
        ID_SNACKBAR -> {
            SnackBarEx()
        }
        ID_LAZY_COLUMN -> {
            LazyColumnEx()
        }
        ID_LAZY_ROW -> {
            LazyRowEx()
        }
        ID_CONSTRAINT_LAYOUT -> {
            ConstraintLayoutEx()
        }
        else -> {
            ColumnEx()
        }
    }
}

