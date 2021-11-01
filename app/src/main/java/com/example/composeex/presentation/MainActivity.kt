package com.example.composeex.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeex.common.Constants
import com.example.composeex.presentation.manufacturer_detail.ManufacturerDetailScreen
import com.example.composeex.presentation.manufacturers.ManufacturersScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colors.background) {
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
        }
    }
}