package com.shekharkg.di_playground.hilt

class Bio(paramName: String, paramDob: String) {

    var name: String = paramName
    var dob: String = paramDob

    fun asString() = "Name: $name, DOB: $dob"
}