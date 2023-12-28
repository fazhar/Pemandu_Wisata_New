package com.myweb.pemanduwisata_view

import androidx.appcompat.app.AppCompatDelegate
import com.myweb.pemanduwisata_view.di.AppModules
import androidx.multidex.MultiDexApplication
import com.orhanobut.hawk.Hawk
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApp: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        Hawk.init(this).build()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MainApp)
            modules(
                listOf(AppModules)
            )
        }
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

    }
}