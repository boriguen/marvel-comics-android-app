package com.botob.marvelcomics.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.botob.marvelcomics.MainActivity
import com.botob.marvelcomics.databinding.MainFragmentBinding
import com.bumptech.glide.Glide
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainFragment : Fragment() {

    companion object {
        /**
         * The ID of the comic to fetch and render.
         */
        private const val COMIC_ID = 1012

        fun newInstance() = MainFragment()
    }

    private lateinit var binding: MainFragmentBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        // TODO: improve the accessibility of the application component to avoid casting.
        (requireActivity() as MainActivity).applicationComponent.inject(viewModel)

        // TODO: refactor this code into something more readable.
        lifecycleScope.launch {
            viewModel.fetchComic(COMIC_ID)?.let {
                launch(Dispatchers.Main) {
                    Glide.with(requireContext()).load(it.coverImageUrl).fitCenter().into(binding.comicThumbnail)
                    binding.titleText.text = it.title
                    binding.descriptionText.text = it.description
                }
            }
        }
    }
}