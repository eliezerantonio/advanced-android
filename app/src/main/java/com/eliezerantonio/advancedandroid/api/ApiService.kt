package com.eliezerantonio.advancedandroid.api

import com.eliezerantonio.advancedandroid.BASE_URL
import com.eliezerantonio.advancedandroid.api.responses.DogListApiResponse
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private val retrofit =
    Retrofit
        .Builder().baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

interface ApiService {
    @GET("dogs")
    suspend fun getAllDogs(): DogListApiResponse
}

object DogsApi {
    val retrofitService: ApiService by lazy{
        retrofit.create(ApiService::class.java)
    }

}