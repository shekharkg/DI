package com.shekharkg.di_playground.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shekharkg.di_playground.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ViewModel

    lateinit var dashboardComponent: DashboardComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        dashboardComponent = (applicationContext as DIApplication).appComponent.dashboardComponent().create()
        dashboardComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}