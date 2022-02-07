package com.botob.marvelcomics.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.botob.marvelcomics.repository.ComicsRepository
import com.botob.marvelcomics.repository.SimpleComic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import javax.inject.Inject

class MainViewModel : ViewModel() {
    @Inject
    lateinit var comicsRepository: ComicsRepository

    suspend fun fetchComic(id: Int): SimpleComic? {
        val deferred = viewModelScope.async(Dispatchers.IO) {
            comicsRepository.fetchComic(id)
        }
        return deferred.await()
    }
}