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
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp).kinetik("profile-page"),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("👤 Profile Screen")

        Text("Name: Android Dev")
        Text("Role: SDK Engineer")

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Back")
        }
    }
}
