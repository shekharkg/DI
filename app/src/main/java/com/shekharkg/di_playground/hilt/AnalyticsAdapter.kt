package com.shekharkg.di_playground.hilt

import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    private val analyticsService: AnalyticsService
) {
}