package com.example.mynewtestproject.repositories


import com.example.mynewtestproject.base.BaseRepositories
import com.example.mynewtestproject.data.remote.api.FilmApiService
import javax.inject.Inject

class FilmRepository @Inject constructor(
    private val filmApiService: FilmApiService,
) : BaseRepositories() {

    fun fetchFilms() = doRequest {
        filmApiService.fetchFilms()
    }

    fun fetchDetailFilm(id: String) = doRequest {
        filmApiService.fetchDetailFilm(id)
    }

}