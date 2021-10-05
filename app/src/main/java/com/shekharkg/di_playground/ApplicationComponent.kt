package com.shekharkg.di_playground

import dagger.Component

@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

}