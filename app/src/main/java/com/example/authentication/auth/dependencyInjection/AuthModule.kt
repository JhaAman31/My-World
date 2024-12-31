package com.example.authentication.auth.dependencyInjection

import android.content.Context
import androidx.credentials.GetCredentialRequest
import com.example.authentication.api.auth.AuthService
import com.example.authentication.api.constants.AuthConstants
import com.example.authentication.auth.data.AuthRepositoryImpl
import com.example.authentication.auth.domain.AuthRepository
import com.example.authentication.auth.sharedPref.AuthPreferencesManager
import com.google.android.libraries.identity.googleid.GetGoogleIdOption
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {
    @Provides
    @Singleton
    fun providesFirebase(): FirebaseAuth = Firebase.auth

    @Provides
    @Singleton
    fun providesAuthRepository(
        auth: FirebaseAuth, getCredentialRequest: GetCredentialRequest, authService: AuthService
    ): AuthRepository = AuthRepositoryImpl(auth, getCredentialRequest, authService)

    @Provides
    @Singleton
    fun providesGoogleClientRequest(): GetCredentialRequest {
        val googleIdOption = GetGoogleIdOption.Builder()
            .setFilterByAuthorizedAccounts(false)
            .setServerClientId(AuthConstants.GOOGLE_WEB_CLIENT_ID)
            .setAutoSelectEnabled(false)
            .build()
        val request = GetCredentialRequest.Builder()
            .addCredentialOption(googleIdOption)
            .build()
        return request
    }

    @Provides
    @Singleton
    fun providesAuthPreferencesManager(@ApplicationContext context: Context): AuthPreferencesManager = AuthPreferencesManager(context)
}