package com.synth.locker.presentation.ui.screen.onboarding

import android.content.Intent
import android.net.Uri
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.synth.locker.R
import com.synth.locker.presentation.ui.components.BackGroundSection
import com.synth.locker.presentation.ui.components.CTAButton
import com.synth.locker.presentation.ui.components.TermsAndPrivacyText

@Composable
fun OnBoardingScreen() {
    val context = LocalContext.current

    Surface(
        color = MaterialTheme.colorScheme.surface,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                BackGroundSection(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()
                )

            }
            CTAButton(
                textButton = R.string.sign_in,
                onClick = {}
            )
            Spacer(modifier = Modifier.weight(0.2f))
            TermsAndPrivacyText(
                onTermsClick = {
                    val intent =
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/locker-dieukhoansudung/trang-ch%E1%BB%A7"))
                    context.startActivity(intent)
                },
                onPrivacyClick = {
                    val intent =
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/locker-chinhsachbaomat/trang-ch%E1%BB%A7"))
                    context.startActivity(intent)
                },
            )
        }
    }
}
@Preview(name = "Small Phone", device = Devices.NEXUS_5, showSystemUi = true)
@Preview(name = "Medium Phone", device = Devices.PIXEL_4, showSystemUi = true)
@Preview(name = "Large Phone", device = Devices.PIXEL_6_PRO, showSystemUi = true)
@Composable
fun MyScreenPreview() {
    OnBoardingScreen()
}