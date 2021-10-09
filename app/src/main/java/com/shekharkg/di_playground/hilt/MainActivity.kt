package com.shekharkg.di_playground.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.shekharkg.di_playground.R

class MainActivity : AppCompatActivity() {

    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        user = User()
        user.init()


        val textView = findViewById<TextView>(R.id.textView)
        textView.text = user.toString()
    }
}