package com.botob.marvelcomics.repository

import com.botob.marvelapi.client.apis.MarvelApi

/**
 * [ComicsRemoteRepository] interacts with the remote Marvel API.
 */
class ComicsRemoteRepository(private val api: MarvelApi) : ComicsRepository {
    /**
     *
     */
    override fun fetchComic(id: Int): SimpleComic? {
        api.getComicIndividual(id)?.let {
            it.data?.results?.first()?.run {
                return SimpleComic(title, description, thumbnail.path)
            }
        } ?: return null
    }
}