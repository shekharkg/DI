package com.shekharkg.di_playground.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
object FirstModule {

    @Provides
    fun provideBio() = Bio(name = "Ashok", dob = "10/10/1990")

}