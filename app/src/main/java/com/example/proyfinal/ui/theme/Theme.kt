package com.example.proyfinal.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Blue = Color(0xFF4A90D9)
val BlueDark = Color(0xFF357ABD)
val GreenTaken = Color(0xFF27AE60)
val RedMissed = Color(0xFFE74C3C)
val BlueLight = Color(0xFFEBF5FF)

private val LightColors = lightColorScheme(
    primary = Blue,
    onPrimary = Color.White,
    primaryContainer = BlueLight,
    background = Color.White,
    surface = Color.White
)

@Composable
fun MediAlertTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = LightColors, content = content)
}