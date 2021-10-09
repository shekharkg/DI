package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class User @Inject constructor(
    private var bio: Bio,
    private var educationInfo: EducationInfo,
    private var workInfo: WorkInfo
) {


    fun getUser() = "${bio.asString()} \n\n ${educationInfo.asString()} \n\n ${workInfo.asString()}"


}