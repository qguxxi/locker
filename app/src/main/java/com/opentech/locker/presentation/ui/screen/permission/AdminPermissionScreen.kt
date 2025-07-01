package com.opentech.locker.presentation.ui.screen.permission

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.opentech.locker.R
import com.opentech.locker.presentation.ui.components.TermsAndPrivacyText

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun AdminPermissionScreen(onGrantPermission: () -> Unit) {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        val isCompact = maxWidth < 360.dp

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Icon + Title
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f).fillMaxWidth(0.8f) // Center the content
            ) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.logo_light),
                    contentDescription = "Lock Icon",
                    tint = Color.Black,
                    modifier = Modifier.size(if (isCompact) 72.dp else 100.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Lock",
                    fontSize = if (isCompact) 32.sp else 36.sp,
                    style = MaterialTheme.typography.displayMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }

            Spacer(modifier = Modifier.height(if (isCompact) 24.dp else 32.dp))

            // Button
            Button(
                onClick = onGrantPermission,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(if (isCompact) 48.dp else 56.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Gear Icon",
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Cho phép quyền quản trị",
                    color = Color.White,
                    fontSize = if (isCompact) 14.sp else 16.sp
                )
            }

            Spacer(modifier = Modifier.height(if (isCompact) 24.dp else 32.dp))

            // Privacy text
            TermsAndPrivacyText()
        }
    }
}


@Preview(
    name = "Small Screen",
    showBackground = true,
    widthDp = 320,
    heightDp = 640
)
@Composable
fun PreviewAdminPermissionScreenSmall() {
    AdminPermissionScreen(onGrantPermission = {})
}

@Preview(
    name = "Medium Screen",
    showBackground = true,
    widthDp = 480,
    heightDp = 800
)
@Composable
fun PreviewAdminPermissionScreenMedium() {
    AdminPermissionScreen(onGrantPermission = {})
}

@Preview(
    name = "Large Screen",
    showBackground = true,
    widthDp = 720,
    heightDp = 1280
)
@Composable
fun PreviewAdminPermissionScreenLarge() {
    AdminPermissionScreen(onGrantPermission = {})
}



