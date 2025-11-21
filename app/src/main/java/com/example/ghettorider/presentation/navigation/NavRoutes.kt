package com.example.ghettorider.presentation.navigation

sealed class NavRoutes(val route : String) {
    object Login : NavRoutes("login")
}