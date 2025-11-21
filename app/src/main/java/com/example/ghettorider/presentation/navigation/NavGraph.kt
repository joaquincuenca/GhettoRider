package com.example.ghettorider.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ghettorider.presentation.ui.onboarding.OnboardingScreen1

@Composable
fun NavGraph(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavRoutes.Onboarding1.route
    ) {
        composable(NavRoutes.Onboarding1.route) {
            OnboardingScreen1()
        }
    }
}