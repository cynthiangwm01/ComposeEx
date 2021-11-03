package com.example.composeex.common.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeex.common.Constants
import com.example.composeex.presentation.Routes
import com.example.composeex.presentation.component_detail.ComponentDetailScreen
import com.example.composeex.presentation.home.HomeScreen
import com.example.composeex.presentation.manufacturer_detail.ManufacturerDetailScreen
import com.example.composeex.presentation.manufacturers.ManufacturersScreen

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.HomeScreenRoute.route
    ) {
        composable(
            route = Routes.HomeScreenRoute.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Routes.ComponentDetailScreenRoute.route
        ) {
            ComponentDetailScreen()
        }
        composable(
            route = Routes.ManufacturersScreenRoute.route
        ) {
            ManufacturersScreen(navController)
        }
        composable(
            route = Routes.ManufacturerDetailScreenRoute.route + "/{${Constants.PARAM_MANUFACTURER_ID}}"
        ) {
            ManufacturerDetailScreen()
        }
    }
}