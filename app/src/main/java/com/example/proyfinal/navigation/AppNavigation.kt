package com.example.proyfinal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyfinal.ui.screens.*

sealed class Screen(val route: String) {
    object Login       : Screen("login")
    object Register    : Screen("register")
    object Home        : Screen("home")
    object AddMed      : Screen("add_medication")
    object History     : Screen("history")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(Screen.Login.route)    { LoginScreen(navController) }
        composable(Screen.Register.route) { RegisterScreen(navController) }
        composable(Screen.Home.route)     { HomeScreen(navController) }
        composable(Screen.AddMed.route)   { AddMedicationScreen(navController) }
        composable(Screen.History.route)  { HistoryScreen(navController) }
    }
}