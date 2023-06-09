package com.example.mynewtestproject.presentation.ui.fragments.film.detail

import com.example.mynewtestproject.base.BaseViewModel
import com.example.mynewtestproject.repositories.FilmRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailFilmViewModel @Inject constructor(
    private val repository: FilmRepository
) : BaseViewModel() {

    fun fetchDetailFilm(id: String) = repository.fetchDetailFilm(id)

}