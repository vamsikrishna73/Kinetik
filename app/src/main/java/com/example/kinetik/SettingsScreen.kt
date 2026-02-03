package com.example.kinetik

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
@Composable
fun SettingsScreen(navController: NavController) {
    var isEnabled by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("⚙️ Settings")

        Row(verticalAlignment = Alignment.CenterVertically) {
            Switch(
                checked = isEnabled,
                onCheckedChange = { isEnabled = it }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Enable Feature")
        }

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Back")
        }
    }
}
