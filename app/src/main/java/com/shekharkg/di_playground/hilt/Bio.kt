package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class Bio @Inject constructor(private var name: String, private var dob: String) {
    fun asString() = "Name: $name, DOB: $dob"
}