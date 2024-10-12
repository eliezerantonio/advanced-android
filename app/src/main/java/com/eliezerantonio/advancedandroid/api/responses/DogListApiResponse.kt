package com.eliezerantonio.advancedandroid.api.responses

import com.squareup.moshi.Json

class DogListApiResponse(
    val message: String,
    @Json(name = "is_success") val isSuccess: Boolean,
    val data: DogListResponse
)