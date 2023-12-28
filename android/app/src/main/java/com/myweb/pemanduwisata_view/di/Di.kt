package com.myweb.pemanduwisata_view.di

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.myweb.pemanduwisata_view.BuildConfig
import com.myweb.pemanduwisata_view.networking.ApiInterface
import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder().baseUrl(BuildConfig.API_URL).client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create()).build()
}

fun provideOkHttpClient(
    loggingInterceptor: HttpLoggingInterceptor,
): OkHttpClient {
    return OkHttpClient().newBuilder()
        .addInterceptor(loggingInterceptor)
        .build()
}

fun provideGsonBuilder(): Gson? {
    return GsonBuilder().apply {
        setPrettyPrinting()
    }.create()
}


fun provideLoggingInterceptor(): HttpLoggingInterceptor {
    val logger = HttpLoggingInterceptor()
    logger.level = HttpLoggingInterceptor.Level.BODY
    return logger
}


fun provideApi(retrofit: Retrofit): ApiInterface = retrofit.create(ApiInterface::class.java)