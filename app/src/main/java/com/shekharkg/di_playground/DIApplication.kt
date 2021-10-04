package com.shekharkg.di_playground

import android.app.Application

class DIApplication: Application() {
    val appComponent =  DaggerApplicationComponent.create()
}