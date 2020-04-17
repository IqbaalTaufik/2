package com.example.tampilanutama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tampilanutama.EXTRA_MESSAGE as EXTRA

class profil : AppCompatActivity() {
private lateinit var texte : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
    }
}
