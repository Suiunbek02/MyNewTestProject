package com.example.mynewtestproject.domain.repositories

import com.example.mynewtestproject.common.Either
import com.example.mynewtestproject.model.FilmModel
import kotlinx.coroutines.flow.Flow

interface FilmRepository {

fun getFilm(): Flow<Either<String, List<FilmModel>>>
}