package com.example.mynewtestproject.presentation.ui.fragments.film.filmOne

import androidx.lifecycle.ViewModel
import com.example.mynewtestproject.repositories.FilmRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FilmViewModel @Inject constructor(
    private val repositories: FilmRepository
) : ViewModel() {
    fun fetchFilms() = repositories.fetchFilms()
}