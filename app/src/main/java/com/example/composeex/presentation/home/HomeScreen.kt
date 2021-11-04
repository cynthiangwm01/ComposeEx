package com.example.composeex.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.composeex.R
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
import com.example.composeex.presentation.ui.theme.standardPagePadding as standardPagePadding1


@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun HomeScreen(
    navController: NavController,
) {
    val list = listOf(
        HomeMenu("Column", Routes.ComponentDetailScreenRoute.route + "/$ID_COLUMN"),
        HomeMenu("Row", Routes.ComponentDetailScreenRoute.route + "/$ID_ROW"),
        HomeMenu(
            "Modifier",
            Routes.ComponentDetailScreenRoute.route + "/$ID_MODIFIER",
        ),
        HomeMenu(
            "Styling Text",
            Routes.ComponentDetailScreenRoute.route + "/$ID_STYLING_TEXT",
        ),
        HomeMenu(
            "SnackBar",
            Routes.ComponentDetailScreenRoute.route + "/$ID_SNACKBAR",
        ),
        HomeMenu(
            "Lazy Column",
            Routes.ComponentDetailScreenRoute.route + "/$ID_LAZY_COLUMN",
        ),
        HomeMenu(
            "Lazy Row",
            Routes.ComponentDetailScreenRoute.route + "/$ID_LAZY_ROW",
        ),
        HomeMenu(
            "Constraint Layout",
            Routes.ComponentDetailScreenRoute.route + "/$ID_CONSTRAINT_LAYOUT",
        ),
        HomeMenu("API call", Routes.ManufacturersScreenRoute.route),
    )

    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        // content padding
        contentPadding = PaddingValues(
            start = standardPagePadding1,
            top = standardPagePadding1,
            end = standardPagePadding1,
            bottom = standardPagePadding1
        ),
        content = {
            items(list.size) { index ->
                CardComponent(
                    list[index],
                    navigateTo = {
                        navController.navigate(list[index].route)
                    },
                )
            }
        }
    )
}