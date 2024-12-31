package com.example.authentication.auth.data

import android.content.Context
import androidx.credentials.CredentialManager
import androidx.credentials.GetCredentialRequest
import com.example.authentication.api.auth.AuthService
import com.example.authentication.api.extension.retrofitCallFlow
import com.example.authentication.api.model.request.GoogleRequestBody
import com.example.authentication.api.model.response.GoogleResponseBody
import com.example.authentication.api.utils.Resource
import com.example.authentication.auth.domain.AuthRepository
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val auth: FirebaseAuth,
    private val googleClientRequest: GetCredentialRequest,
    private val authService: AuthService
): AuthRepository {
    override suspend fun googleSignIn(context: Context): Flow<Resource<GoogleResponseBody>> = retrofitCallFlow(
        body = {
            val credentialManager = CredentialManager.create(context)
            val request = googleClientRequest
            val result = credentialManager.getCredential(
                context = context,
                request = request
            )
            val credential = result.credential
            val googleIdToken = GoogleIdTokenCredential.createFrom(credential.data).idToken
            val firebaseCredential = GoogleAuthProvider.getCredential(googleIdToken, null)
            auth.signInWithCredential(firebaseCredential).await()
            val authResult = authService.googleSignIn(GoogleRequestBody(googleIdToken))
            authResult
        },
        tag = "GoogleSignIn"
    )

    override fun getCurrentUser(): FirebaseUser? = auth.currentUser

    override suspend fun signOut() = auth.signOut()

}