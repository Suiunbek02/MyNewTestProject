package com.example.mynewtestproject.data.remote.api


import com.example.mynewtestproject.model.FilmModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FilmApiService {

    @GET("films")
    suspend fun fetchFilms():Response<ArrayList<FilmModel>>

    @GET("films/{id}")
    suspend fun fetchDetailFilm(
        @Path("id") id: String
    ): FilmModel

}