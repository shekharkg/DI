package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class EducationInfo @Inject constructor(
    private var highestEducation: String,
    private var collage: String,
    private var stream: String
) {


    fun asString() = "Education: $highestEducation, Collage: $collage, Stream: $stream"

}