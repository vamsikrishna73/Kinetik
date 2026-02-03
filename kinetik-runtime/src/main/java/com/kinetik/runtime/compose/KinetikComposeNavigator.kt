package com.kinetik.runtime.compose

import android.util.Log
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalView
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.kinetik.runtime.core.ScreenEvent
import com.kinetik.runtime.core.ScreenTracker
import com.kinetik.runtime.core.ScreenType

@Composable
fun TrackComposeNavigation(navController: NavController) {
    val entry by navController.currentBackStackEntryAsState()
    val route = entry?.destination?.route

    LaunchedEffect(route) {
        route?.let {

            Log.d("Kinetic", "TrackComposeNavigation: $route")
            ScreenTracker.notify(
                ScreenEvent(
                    name = it,
                    type = ScreenType.COMPOSE
                )
            )
        }
    }
}
