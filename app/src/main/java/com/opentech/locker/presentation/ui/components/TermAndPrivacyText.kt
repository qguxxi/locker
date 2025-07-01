@file:Suppress("DEPRECATION")

package com.opentech.locker.presentation.ui.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle

import androidx.compose.ui.unit.dp

@Composable
fun TermsAndPrivacyText(
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val annotatedText = buildAnnotatedString {
        withStyle(SpanStyle(color = (MaterialTheme.colorScheme.onSurface), fontWeight = FontWeight.Medium)) {
            append("Bằng cách đăng nhập, bạn chấp nhận ")
        }
        // Link: Chính sách bảo mật
        pushStringAnnotation(tag = "PRIVACY", annotation = "privacy")
        withStyle(SpanStyle(color = Color(0xFF1E88E5), fontWeight = FontWeight.Medium)) {
            append("chính sách bảo mật")
        }
        pop()
        withStyle(SpanStyle(color = (MaterialTheme.colorScheme.onSurface), fontWeight = FontWeight.Medium)) {
            append(" và ")
        }
        // Link: Điều khoản sử dụng
        pushStringAnnotation(tag = "TERMS", annotation = "terms")
        withStyle(SpanStyle(color = Color(0xFF1E88E5), fontWeight = FontWeight.Medium)) {
            append("điều khoản sử dụng")
        }
        pop()
    }

    ClickableText(
        text = annotatedText,
        style = MaterialTheme.typography.bodySmall.copy(textAlign = TextAlign.Center),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        onClick = { offset ->
            annotatedText.getStringAnnotations(start = offset, end = offset).firstOrNull()?.let {
                when (it.tag) {
                    "PRIVACY" -> {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/locker-chinhsachbaomat/trang-ch%E1%BB%A7"))
                        context.startActivity(intent)
                    }
                    "TERMS" -> {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/locker-dieukhoansudung/trang-ch%E1%BB%A7"))
                        context.startActivity(intent)
                    }
                    }
            }
        }
    )
}

