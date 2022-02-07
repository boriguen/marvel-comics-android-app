package com.botob.marvelcomics.dependencyinjection

import com.botob.marvelcomics.ui.main.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(mainViewModel: MainViewModel)
}