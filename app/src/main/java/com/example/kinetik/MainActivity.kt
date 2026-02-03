package com.example.kinetik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kinetik.ui.theme.KinetikTheme
import com.kinetik.runtime.compose.KinetikComposeAnimationEngine
import com.kinetik.runtime.compose.KinetikComposeBootstrap

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        KinetikComposeBootstrap.init()
        KinetikComposeAnimationEngine.init()
        enableEdgeToEdge()
        setContent {
            KinetikTheme {
                AppNavHost()
            }
        }
    }

    override fun onResume() {
        super.onResume()
    }
}
