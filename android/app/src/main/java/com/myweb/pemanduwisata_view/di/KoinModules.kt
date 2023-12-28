package com.myweb.pemanduwisata_view.di

import com.myweb.pemanduwisata_view.AppUtils
import com.myweb.pemanduwisata_view.di.provideApi
import com.myweb.pemanduwisata_view.di.provideGsonBuilder
import com.myweb.pemanduwisata_view.di.provideLoggingInterceptor
import com.myweb.pemanduwisata_view.di.provideOkHttpClient
import com.myweb.pemanduwisata_view.di.provideRetrofit
import org.koin.dsl.module

val AppModules = module {
    single { provideGsonBuilder() }
    single { provideLoggingInterceptor() }
    single { provideOkHttpClient(get()) }
    single { provideRetrofit(get()) }
    single { provideApi(get()) }
    single { AppUtils() }

}