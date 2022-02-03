package com.botob.marvelcomics.repository

/**
 * [ComicsRepository] offers an interface to interact with comics.
 */
interface ComicsRepository {
    /**
     * Fetches the comic of given [id].
     *
     * @return a [SimpleComic] instance when found; otherwise, null.
     */
    fun fetchComic(id: Int): SimpleComic?
}