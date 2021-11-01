package com.example.composeex.presentation

import com.example.composeex.common.Constants

sealed class Routes(val route: String) {
    object ManufacturersScreen: Routes(Constants.ROUTE_MANUFACTURERS_SCREEN)
    object ManufacturerDetailScreen: Routes(Constants.ROUTE_MANUFACTURER_DETAIL_SCREEN)
}
