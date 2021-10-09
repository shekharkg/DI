package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class User @Inject constructor(
    private var bio: Bio,
    private var educationInfo: EducationInfo
) {


    var workInfo: WorkInfo = WorkInfo()


    init {
        workInfo.init(companyName = "HCL", exp = "10 years", educationInfo = educationInfo)
    }

    private fun getBio() = bio.asString()

    private fun getEducation() = educationInfo.asString()


    fun getUser() = "${getBio()} \n\n ${getEducation()}"


}