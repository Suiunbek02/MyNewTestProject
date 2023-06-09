package com.example.mynewtestproject.presentation.ui.fragments.film.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.mynewtestproject.R
import com.example.mynewtestproject.base.BaseFragment
import com.example.mynewtestproject.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.subscribe
import javax.annotation.meta.When

@AndroidEntryPoint
class DetailFragment :
    BaseFragment<FragmentDetailBinding, DetailFilmViewModel>(R.layout.fragment_detail) {

    override val binding by viewBinding(FragmentDetailBinding::bind)
    override val viewModel: DetailFilmViewModel by viewModels()
    private val args by navArgs<DetailFragmentArgs>()

    override fun setupObserve() = with(binding) {
        viewModel.fetchDetailFilm(args.id).subscribe(

        )
//        viewModel.fetchDetailFilm(args.id).subscribe(
//            onError = {},
//            onSuccess = {
//                title.text = it.title
//                Glide.with(imageView).load(it.image).into(imageView)
//                rating.text = it.rtScore
//                description.text = it.description
        //original.text = it.description
//            }

    }

}