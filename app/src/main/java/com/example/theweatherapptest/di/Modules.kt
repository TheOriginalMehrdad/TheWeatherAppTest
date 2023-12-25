package com.example.theweatherapptest.di

import com.example.theweatherapptest.util.createApiService
import org.koin.dsl.module

val myModules = module {

    single { createApiService() }

}