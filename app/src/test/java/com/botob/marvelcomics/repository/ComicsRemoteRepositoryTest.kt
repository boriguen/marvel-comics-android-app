package com.botob.marvelcomics.repository

import com.botob.marvelapi.client.apis.MarvelApi
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ComicsRemoteRepositoryTest {
    companion object {
        private const val COMIC_ID = 1012

        private const val EXPECTED_TITLE =
            "Ultimate Spider-Man Vol. 1: Power & Responsibility (Trade Paperback)"

        private const val EXPECTED_DESCRIPTION =
            "High school student Peter Parker finds himself the recipient of strange and amazing powers. Bullied by his classmates and targeted by the deadly Green Goblin, he learns that with great power, there must also come great responsibility."

        private const val EXPECTED_THUMBNAIL_PATH =
            "http://i.annihil.us/u/prod/marvel/i/mg/c/60/4bc66d539afd0"
    }

    private lateinit var repository: ComicsRepository

    @Before
    fun setUp() {
        repository = ComicsRemoteRepository(
            MarvelApi(
                System.getenv("MARVEL_API_PRIVATE_KEY") ?: "",
                System.getenv("MARVEL_API_PUBLIC_KEY") ?: ""
            )
        )
    }

    @After
    fun tearDown() {
    }

    @Test
    fun fetchComic() {
        val comic = repository.fetchComic(COMIC_ID)

        Assert.assertNotNull(comic)
        Assert.assertEquals(EXPECTED_TITLE, comic?.title)
        Assert.assertEquals(EXPECTED_DESCRIPTION, comic?.description)
        Assert.assertEquals(EXPECTED_THUMBNAIL_PATH, comic?.coverImageUrl)
    }
}