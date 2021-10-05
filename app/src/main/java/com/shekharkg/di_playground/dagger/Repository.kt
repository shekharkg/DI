package com.shekharkg.di_playground.dagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(service: DashboardRetrofitService) {

}