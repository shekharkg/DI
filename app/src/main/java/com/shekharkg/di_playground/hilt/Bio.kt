package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class Bio @Inject constructor(paramName: String, paramDob: String) {

    var name: String = paramName
    var dob: String = paramDob

    fun asString() = "Name: $name, DOB: $dob"
}