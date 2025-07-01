package com.opentech.locker

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.opentech.locker.navigation.LockerNavHost

@Composable
fun LockerApp(modifier: Modifier = Modifier) {
    LockerNavHost()
}