package com.example.theweatherapptest.util

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


interface ApiService {


}

fun createApiService(): ApiService {

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    return retrofit.create(ApiService::class.java)

}
