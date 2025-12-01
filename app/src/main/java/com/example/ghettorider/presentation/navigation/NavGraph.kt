package com.example.ghettorider.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ghettorider.presentation.ui.onboarding.OnboardingScreen1
import com.example.ghettorider.presentation.ui.admin.adminglogin.AdminLoginScreen
import com.example.ghettorider.presentation.ui.admin.adminsignup.AdminSignupScreen
import com.example.ghettorider.presentation.ui.dashboard.DashboardScreen

@Composable
fun NavGraph(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavRoutes.Onboarding1.route
    ) {
        // Onboarding
        composable(NavRoutes.Onboarding1.route) {
            OnboardingScreen1(
                onAdminClick = {
                    navController.navigate(NavRoutes.AdminLogin.route)
                },
                onBookRide = {
                    navController.navigate(NavRoutes.Dashboard.route)
                }

            )
        }

        // Admin Login
        composable(NavRoutes.AdminLogin.route) {
            AdminLoginScreen(
                onSignupClick = { navController.navigate(NavRoutes.AdminSignup.route) }
            )
        }
        // Admin Signup
        composable(NavRoutes.AdminSignup.route) {
            AdminSignupScreen()
        }

        // Admin Signup
        composable(NavRoutes.Dashboard.route) {
            DashboardScreen()
        }
    }
}
