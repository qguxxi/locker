package com.synth.locker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.synth.locker.presentation.ui.screen.onboarding.OnBoardingScreen
import com.synth.locker.presentation.ui.theme.LockerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LockerTheme {
                OnBoardingScreen()
            }
        }
    }
}

