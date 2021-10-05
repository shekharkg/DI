package com.shekharkg.di_playground.dagger

import dagger.Module
import dagger.Subcomponent


@Module(subcomponents = [DashboardComponent::class])
class SubComponentModule {}

@ActivityScope
@Subcomponent
interface DashboardComponent {


    @Subcomponent.Factory
    interface Factory {
        fun create(): DashboardComponent
    }

    fun inject(activity: MainActivity)

}