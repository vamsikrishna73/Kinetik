package com.example.kinetik

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kinetik.runtime.compose.kinetik

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("🏠 Home Screen")

        Button(modifier = Modifier.kinetik("home-button"), onClick = {
            navController.navigate(Screen.Profile.route)
        }) {
            Text("Go to Profile")
        }

        Button(onClick = {
            navController.navigate(Screen.Settings.route)
        }) {
            Text("Go to Settings")
        }

        Button(onClick = {
            navController.navigate(Screen.Details.createRoute(42))
        }) {
            Text("Open Details (id=42)")
        }
    }
}
