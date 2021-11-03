package com.example.composeex.presentation

import com.example.composeex.common.Constants

sealed class Routes(val route: String) {

    // Home
    object HomeScreenRoute : Routes(Constants.ROUTE_HOME_SCREEN)

    // Component detail
    object ComponentDetailScreenRoute : Routes(Constants.ROUTE_COMPONENT_DETAIL_SCREEN)

    // API
    object ManufacturersScreenRoute : Routes(Constants.ROUTE_MANUFACTURERS_SCREEN)
    object ManufacturerDetailScreenRoute : Routes(Constants.ROUTE_MANUFACTURER_DETAIL_SCREEN)
}
