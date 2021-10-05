package com.shekharkg.di_playground.dagger

import android.app.Application
import com.shekharkg.di_playground.DaggerApplicationComponent

class DIApplication: Application() {
    val appComponent = DaggerApplicationComponent.create()
}