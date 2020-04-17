package com.example.tampilanutama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textreg = findViewById(R.id.textreg) as TextView
        textreg.setOnClickListener{
            startActivity(Intent(this,registrasi::class.java))
        }
    }
}
