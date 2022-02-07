package com.botob.marvelcomics.dependencyinjection

import com.botob.marvelapi.client.apis.MarvelApi
import com.botob.marvelcomics.BuildConfig
import com.botob.marvelcomics.repository.ComicsRemoteRepository
import com.botob.marvelcomics.repository.ComicsRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule() {
    @Provides
    @Singleton
    fun provideComicsRepository(): ComicsRepository {
        val api = MarvelApi(BuildConfig.MARVEL_API_PRIVATE_KEY, BuildConfig.MARVEL_API_PUBLIC_KEY)
        return ComicsRemoteRepository(api)
    }
}