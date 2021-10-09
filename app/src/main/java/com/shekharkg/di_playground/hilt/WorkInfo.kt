package com.shekharkg.di_playground.hilt

class WorkInfo() {

    lateinit var companyName: String
    lateinit var yearOfExperience: String
    lateinit var educationInfo: EducationInfo

    fun init(companyName: String, exp: String, educationInfo: EducationInfo) {
        this.companyName = companyName
        this.yearOfExperience = exp
        this.educationInfo = educationInfo
    }

}