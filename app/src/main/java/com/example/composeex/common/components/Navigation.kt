package com.example.composeex.common.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeex.common.Constants
import com.example.composeex.presentation.Routes
import com.example.composeex.presentation.manufacturer_detail.ManufacturerDetailScreen
import com.example.composeex.presentation.manufacturers.ManufacturersScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.ManufacturersScreen.route
    ) {
        composable(
            route = Routes.ManufacturersScreen.route
        ) {
            ManufacturersScreen(navController)
        }
        composable(
            route = Routes.ManufacturerDetailScreen.route + "/{${Constants.PARAM_MANUFACTURER_ID}}"
        ) {
            ManufacturerDetailScreen()
        }
    }
}