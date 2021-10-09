package com.shekharkg.di_playground.hilt

class Bio {

    lateinit var name: String
    lateinit var dob: String

    fun init(name: String, dob: String) {
        this.name = name
        this.dob = dob
    }

    fun asString() = "Name: $name, DOB: $dob"
}