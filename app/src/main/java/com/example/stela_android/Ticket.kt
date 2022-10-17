package com.example.stela_android

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Ticket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trii_tiket)
    }

    fun whatsapp(view: View) {
        val url = "https://api.whatsapp.com/send/?phone=081952434368&text&type=phone_number&app_absent=0"
        val bukeBrowser = Intent(Intent.ACTION_VIEW)
        bukeBrowser.data = Uri.parse(url)
        startActivity(bukeBrowser)
    }

}