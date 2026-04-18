package com.example.proyfinal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyfinal.screens.AddMedicationScreen
import com.example.proyfinal.screens.HistoryScreen
import com.example.proyfinal.screens.HomeScreen
import com.example.proyfinal.screens.LoginScreen
import com.example.proyfinal.screens.ProfileScreen
import com.example.proyfinal.screens.RegisterScreen

sealed class Screen(val route: String) {
    object Login    : Screen("login")
    object Register : Screen("register")
    object Home     : Screen("home")
    object AddMed   : Screen("add_medication")
    object History  : Screen("history")
    object Profile  : Screen("profile")
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
        composable(Screen.Profile.route)  { ProfileScreen(navController) }
    }
}