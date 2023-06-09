package com.example.mynewtestproject.presentation.ui.fragments.film.filmOne

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.mynewtestproject.R
import com.example.mynewtestproject.base.BaseFragment
import com.example.mynewtestproject.common.Either
import com.example.mynewtestproject.databinding.FragmentFilmBinding
import com.example.mynewtestproject.model.toDomain
import com.example.mynewtestproject.presentation.ui.adapters.FilmAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FilmFragment : BaseFragment<FragmentFilmBinding, FilmViewModel>(R.layout.fragment_film) {

    override val binding by viewBinding(FragmentFilmBinding::bind)
    override val viewModel: FilmViewModel by viewModels()
    private val filmAdapter = FilmAdapter(this)

    override fun initialize() {
        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = filmAdapter
        }
    }

    override fun setupObserve() {
        viewModel.fetchFilms().collect {
            when (it) {
                is Either.Left -> {
                    Log.e("", it.massage.toString())
                }
                is Either.Right -> {
                    val mappingList = it.data?.body()?.map { model ->
                        model.toDomain()
                    }
                    filmAdapter.submitList(mappingList)
                }
            }
        }
    }

}