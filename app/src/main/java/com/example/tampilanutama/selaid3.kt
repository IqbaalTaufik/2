package com.example.tampilanutama

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class selaid3 : AppCompatActivity() {
    private lateinit var btn3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v1)
        btn3 = findViewById(R.id.button3)
        btn3.setOnClickListener{
            startActivity(Intent(this,verifikasiakun::class.java))
        }
    }
}
