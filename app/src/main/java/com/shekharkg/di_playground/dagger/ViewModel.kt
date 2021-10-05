package com.shekharkg.di_playground.dagger

import javax.inject.Inject

@ActivityScope
class ViewModel @Inject constructor(repository: Repository) {

}