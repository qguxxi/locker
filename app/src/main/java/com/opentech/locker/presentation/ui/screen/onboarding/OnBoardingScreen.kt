package com.opentech.locker.presentation.ui.screen.onboarding


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.opentech.locker.R
import com.opentech.locker.presentation.ui.components.BackGroundSection
import com.opentech.locker.presentation.ui.components.CTAButton
import com.opentech.locker.presentation.ui.components.TermsAndPrivacyText

@Composable
fun OnBoardingScreen(
    modifier: Modifier = Modifier,
    onSignInClick: () -> Unit
) {
    Surface(
        color = MaterialTheme.colorScheme.surface,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            OnBoardingContent(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )
            CTAButton(
                textButton = R.string.sign_in,
                onClick = onSignInClick
            )
            Spacer(modifier = Modifier.weight(0.2f))
            TermsAndPrivacyText()
        }
    }
}

@Composable
private fun OnBoardingContent(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        BackGroundSection(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
        )
    }
}

@Preview(name = "Small Phone", device = Devices.NEXUS_5, showSystemUi = true)
@Preview(name = "Medium Phone", device = Devices.PIXEL_4, showSystemUi = true)
@Preview(name = "Large Phone", device = Devices.PIXEL_6_PRO, showSystemUi = true)
@Composable
fun OnBoardingScreenPreview() {
    OnBoardingScreen(onSignInClick = {})
}

// TODO: Add Baseline Profiles and enable R8 optimizations in your build.gradle for better performance.