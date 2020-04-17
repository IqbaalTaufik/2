package com.example.tampilanutama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class registrasi : AppCompatActivity() {
private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        //gol darah
        val gdarahSpinner : Spinner = findViewById(R.id.spdarah)
        ArrayAdapter.createFromResource(this,R.array.drh,R.layout.spstyle).also {
            adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            gdarahSpinner.adapter = adapter
        }

        //Reshus
        val greshusSpinner : Spinner = findViewById(R.id.Rrenshus)
        ArrayAdapter.createFromResource(this,R.array.Renshus,R.layout.spstyle).also {
            adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            greshusSpinner.adapter = adapter
        }

        //job
        val gjobSpinner : Spinner = findViewById(R.id.kerjob)
        ArrayAdapter.createFromResource(this,R.array.Jb,R.layout.spstyle).also {
            adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            gjobSpinner.adapter = adapter
        }
        btn = findViewById(R.id.tmbl1)
        btn.setOnClickListener{
            val t1 = findViewById<EditText>(R.id.editText3)
            val msg = t1.text.toString()
            startActivity(Intent(this,verifikasiakun::class.java))
        }
    }
    fun onRadioButtonClicked(view: View){
        if(view is RadioButton){
            val checked = view.isChecked
        }
    }
}
