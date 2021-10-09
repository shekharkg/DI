package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class WorkInfo @Inject constructor(
    private var companyName: String,
    private var exp: String,
    private var educationInfo: EducationInfo
) {

    fun asString() = "CompanyName: $companyName, Experience: $exp, Education: ${educationInfo.asString()}"

}