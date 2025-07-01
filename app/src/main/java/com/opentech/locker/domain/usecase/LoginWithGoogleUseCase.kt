package com.opentech.locker.domain.usecase

import com.opentech.locker.domain.repository.AuthRepository
import com.opentech.locker.domain.repository.AuthResult
import javax.inject.Inject

class LoginWithGoogleUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(idToken: String): AuthResult {
        return repository.loginWithGoogle(idToken)
    }
}
