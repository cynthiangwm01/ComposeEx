package com.example.composeex.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composeex.common.Constants.ID_ANIMATION
import com.example.composeex.common.Constants.ID_API_CALL
import com.example.composeex.common.Constants.ID_COLUMN
import com.example.composeex.common.Constants.ID_CONSTRAINT_LAYOUT
import com.example.composeex.common.Constants.ID_LAZY_COLUMN
import com.example.composeex.common.Constants.ID_LAZY_ROW
import com.example.composeex.common.Constants.ID_MODIFIER
import com.example.composeex.common.Constants.ID_ROW
import com.example.composeex.common.Constants.ID_SNACKBAR
import com.example.composeex.common.Constants.ID_STYLING_TEXT
import com.example.composeex.domain.model.HomeMenu
import com.example.composeex.presentation.Routes
import com.example.composeex.presentation.home.components.CardComponent
import com.example.composeex.presentation.ui.theme.standardPagePadding

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun HomeScreen(
    navController: NavController,
) {
    val list = listOf<HomeMenu>(
        HomeMenu(ID_COLUMN, "Column", Routes.ComponentDetailScreenRoute.route),
        HomeMenu(ID_ROW, "Row", Routes.ComponentDetailScreenRoute.route),
        HomeMenu(ID_MODIFIER, "Modifier", Routes.ComponentDetailScreenRoute.route),
        HomeMenu(ID_STYLING_TEXT, "Styling Text", Routes.ComponentDetailScreenRoute.route),
        HomeMenu(ID_SNACKBAR, "SnackBar", Routes.ComponentDetailScreenRoute.route),
        HomeMenu(ID_LAZY_COLUMN, "Lazy Column", Routes.ComponentDetailScreenRoute.route),
        HomeMenu(ID_LAZY_ROW, "Lazy Row", Routes.ComponentDetailScreenRoute.route),
        HomeMenu(
            ID_CONSTRAINT_LAYOUT,
            "Constraint Layout",
            Routes.ComponentDetailScreenRoute.route
        ),
        HomeMenu(ID_ANIMATION, "Animation", Routes.ComponentDetailScreenRoute.route),
        HomeMenu(ID_API_CALL, "API call", Routes.ManufacturerDetailScreenRoute.route),
    )

    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        // content padding
        contentPadding = PaddingValues(
            start = standardPagePadding,
            top = standardPagePadding,
            end = standardPagePadding,
            bottom = standardPagePadding
        ),
        content = {
            items(list.size) { index ->
                CardComponent(
                    list[index],
                )
            }
        }
    )


}