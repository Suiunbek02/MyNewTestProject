package com.example.mynewtestproject.domain.usecase

import com.example.mynewtestproject.repositories.FilmRepository
import javax.inject.Inject

class GetFilmDataUseCase @Inject constructor(
    private val filmRepository: FilmRepository
) {
operator fun invoke() = filmRepository.fetchFilms()
}