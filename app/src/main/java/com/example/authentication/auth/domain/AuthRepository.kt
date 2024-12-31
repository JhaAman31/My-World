package com.example.authentication.auth.domain

import android.content.Context
import com.example.authentication.api.model.response.GoogleResponseBody
import com.example.authentication.api.utils.Resource
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun googleSignIn(context: Context): Flow<Resource<GoogleResponseBody>>
    fun getCurrentUser(): FirebaseUser?
    suspend fun signOut()
}