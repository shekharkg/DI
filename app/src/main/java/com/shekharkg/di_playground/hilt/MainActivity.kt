package com.shekharkg.di_playground.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shekharkg.di_playground.R
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject lateinit var analyticsAdapter: AnalyticsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}