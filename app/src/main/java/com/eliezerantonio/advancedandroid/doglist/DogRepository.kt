package com.eliezerantonio.advancedandroid.doglist

import com.eliezerantonio.advancedandroid.Dog
import com.eliezerantonio.advancedandroid.api.DogsApi.retrofitService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DogRepository {
    suspend fun downloadDogs(): List<Dog> {
        return withContext(Dispatchers.IO) {
            val dogListApiResponse = retrofitService.getAllDogs()
            dogListApiResponse.data.dogs
        }
    }

}