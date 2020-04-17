package com.example.tampilanutama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class verifikasiakun : AppCompatActivity() {
private lateinit var btn4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasiakun)
        btn4 = findViewById(R.id.button4)
        btn4.setOnClickListener{
            startActivity(Intent(this,profil::class.java))
        }
    }
}
