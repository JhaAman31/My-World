package com.example.authentication.api.auth

import com.example.authentication.api.constants.ApiHeaders
import com.example.authentication.api.constants.AuthConstants
import com.example.authentication.api.model.request.GoogleRequestBody
import com.example.authentication.api.model.response.GoogleResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface AuthService {
    @Headers(ApiHeaders.NO_AUTH_HEADER)
    @POST(AuthConstants.GOOGLE_ENDPOINT)
    suspend fun googleSignIn(
        @Body requestBody: GoogleRequestBody
    ): Response<GoogleResponseBody>
}