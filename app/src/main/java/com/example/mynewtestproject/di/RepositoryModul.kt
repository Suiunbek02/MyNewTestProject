package com.example.mynewtestproject.di

import com.example.mynewtestproject.data.repositories.FilmRepositoryImpl
import com.example.mynewtestproject.repositories.FilmRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModul {

    @Binds
 fun bindFilmRepository(repository: FilmRepositoryImpl) : FilmRepository

}