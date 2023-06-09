package com.example.mynewtestproject.data.repositories

import com.example.mynewtestproject.base.BaseRepositories

import com.example.mynewtestproject.data.remote.api.FilmApiService
import com.example.mynewtestproject.domain.repositories.FilmRepository
import com.example.mynewtestproject.model.toDomain
import javax.inject.Inject


class FilmRepositoryImpl @Inject constructor(
    private val paiService: FilmApiService
) : BaseRepositories(), FilmRepository {

    override fun getFilm() = doRequest {
        paiService.fetchFilms().body()?.map { filmModel ->
            filmModel.toDomain()
        }
    }
}






