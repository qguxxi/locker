package com.opentech.locker.domain.repository

import com.opentech.locker.domain.model.User

interface AuthRepository {
    suspend fun loginWithGoogle(idToken: String): AuthResult
}

sealed class AuthResult {
    data class Success(val user: User) : AuthResult()
    data class Error(val message: String) : AuthResult()
}

