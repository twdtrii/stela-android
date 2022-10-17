package com.example.stela_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed

class LandingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        Handler(Looper.getMainLooper()).postDelayed({
            val mainIntent = Intent(this, Login::class.java)
            startActivity(mainIntent)
            finish()
        }, 3000)
    }
}