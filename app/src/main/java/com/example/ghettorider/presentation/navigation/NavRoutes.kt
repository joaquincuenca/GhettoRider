package com.example.ghettorider.presentation.navigation

sealed class NavRoutes(val route : String) {
    object Onboarding1 : NavRoutes("onboarding1")
}