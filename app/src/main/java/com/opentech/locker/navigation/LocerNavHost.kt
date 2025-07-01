package com.opentech.locker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.opentech.locker.presentation.ui.screen.auth.SignInScreen


@Composable
fun LockerNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Screens.SignInScreen.route) {
        composable(Screens.SignInScreen.route) {
            SignInScreen()
        }
    }
}