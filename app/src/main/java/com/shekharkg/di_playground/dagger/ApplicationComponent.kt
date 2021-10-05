package com.shekharkg.di_playground.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, SubComponentModule::class])
interface ApplicationComponent {

    fun dashboardComponent(): DashboardComponent.Factory

}