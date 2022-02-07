package com.botob.marvelcomics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.botob.marvelcomics.dependencyinjection.ApplicationComponent
import com.botob.marvelcomics.dependencyinjection.ApplicationModule
import com.botob.marvelcomics.dependencyinjection.DaggerApplicationComponent
import com.botob.marvelcomics.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    val applicationComponent: ApplicationComponent =
        DaggerApplicationComponent.builder().applicationModule(
            ApplicationModule()
        ).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}