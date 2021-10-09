package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class User @Inject constructor() {

    @Inject lateinit var bio: Bio
    var workInfo: WorkInfo = WorkInfo()
    var educationInfo: EducationInfo = EducationInfo()


    fun init() {

        educationInfo.init(highestEducation = "Graduation", collage = "CHRIST", stream = "BSc")
        workInfo.init(companyName = "HCL", exp = "10 years", educationInfo = educationInfo)
    }

    fun getName() = bio.name

    fun getBio() = bio.asString()


}