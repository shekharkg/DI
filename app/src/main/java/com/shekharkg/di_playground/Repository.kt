package com.shekharkg.di_playground

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(service: DashboardRetrofitService) {

}