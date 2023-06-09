package com.example.mynewtestproject.di

import com.example.mynewtestproject.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModel {

    @Singleton
    private val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideFilmApiService() = retrofitClient.provideFilmApiService()

}