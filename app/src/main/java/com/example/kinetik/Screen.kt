package com.example.kinetik

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Settings : Screen("settings")
    object Details : Screen("details/{id}") {
        fun createRoute(id: Int) = "details/$id"
    }
}
