package com.example.mynewtestproject.domain.usecase

import com.example.mynewtestproject.domain.repositories.FilmRepository
import com.example.mynewtestproject.model.FilmModel
import javax.inject.Inject

class SaveFilmUseCase @Inject constructor(
    private val repository: FilmRepository
) {
   operator fun invoke() = repository.getFilm()

}