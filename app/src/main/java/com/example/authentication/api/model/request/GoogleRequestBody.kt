package com.example.authentication.api.model.request

import com.squareup.moshi.Json

data class GoogleRequestBody(
    @Json(name = "auth_token")
    val authToken: String
)