package com.shekharkg.di_playground.hilt

class User {

    var bio: Bio = Bio()
    var workInfo: WorkInfo = WorkInfo()
    var educationInfo: EducationInfo = EducationInfo()


    fun init() {
        bio.init(name = "Ashok", dob = "10/10/1990")
        educationInfo.init(highestEducation = "Graduation", collage = "CHRIST", stream = "BSc")
        workInfo.init(companyName = "HCL", exp = "10 years", educationInfo = educationInfo)
    }

    fun getName() = bio.name


}