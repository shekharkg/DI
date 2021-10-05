package com.shekharkg.di_playground.dagger

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideDashboardRetrofitService(okHttpClient: OkHttpClient): DashboardRetrofitService {
        return Retrofit.Builder()
            .baseUrl("")
            .build()
            .create(DashboardRetrofitService::class.java)
    }

    @Provides
    fun getOKHttpClient(): OkHttpClient {
        return OkHttpClient()
    }

}