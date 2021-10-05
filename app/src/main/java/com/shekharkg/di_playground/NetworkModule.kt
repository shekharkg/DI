package com.shekharkg.di_playground

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class NetworkModule {

    @Provides
    fun provideDashboardRetrofitService(): DashboardRetrofitService {
        return Retrofit.Builder()
            .baseUrl("")
            .build()
            .create(DashboardRetrofitService::class.java)
    }

}