package com.shekharkg.di_playground.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
object ThirdModule {
    
    @Provides
    fun provideWorkInfo() = WorkInfo(companyName = "HCL", exp = "10 years",
        EducationInfo(highestEducation = "Graduation", collage = "CHRIST", stream = "BSc"))
}