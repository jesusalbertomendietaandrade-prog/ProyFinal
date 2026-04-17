package com.example.proyfinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.proyfinal.navigation.AppNavigation
import com.example.proyfinal.ui.theme.MediAlertTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediAlertTheme {
                AppNavigation()
            }
        }
    }
}