package com.shekharkg.di_playground.hilt

class EducationInfo {


    lateinit var highestEducation: String
    lateinit var collageName: String
    lateinit var stream: String

    fun init(highestEducation: String, collage: String, stream: String) {
        this.highestEducation = highestEducation
        this.collageName = collageName
        this.stream = stream
    }

}