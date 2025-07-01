package com.opentech.locker.navigation

sealed class Screens(val route: String) {
    object HomeScreen : Screens("home")
    object SignInScreen : Screens("sign_in")
}