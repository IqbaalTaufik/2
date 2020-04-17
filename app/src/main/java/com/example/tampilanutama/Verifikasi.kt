package com.example.tampilanutama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Verifikasi : AppCompatActivity() {
private lateinit var btn3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi)
        btn3 = findViewById(R.id.button3)
        btn3.setOnClickListener{
            startActivity(Intent(this,verifikasiakun::class.java))
        }
    }
}
