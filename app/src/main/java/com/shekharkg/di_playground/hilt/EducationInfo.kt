package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class EducationInfo @Inject constructor(highestEducation: String, collage: String, stream: String) {


    var highestEducation: String = highestEducation
    var collageName: String = collage
    var stream: String = stream

    fun asString() = "Education: $highestEducation, Collage: $collageName, Stream: $stream"

}