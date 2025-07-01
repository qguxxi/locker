package com.opentech.locker.presentation.ui.screen.auth

import com.opentech.locker.domain.model.User

data class AuthUiState(
    val isLoading: Boolean = false,
    val user: User? = null,
    val error: String? = null,
    val isSignedIn: Boolean = false
)