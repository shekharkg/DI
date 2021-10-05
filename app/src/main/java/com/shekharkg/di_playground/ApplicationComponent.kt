package com.shekharkg.di_playground

import dagger.Component

@Component
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

}