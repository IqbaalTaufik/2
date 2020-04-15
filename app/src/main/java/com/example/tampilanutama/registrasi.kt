package com.example.tampilanutama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Spinner

class registrasi : AppCompatActivity() {

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
    }
    fun onRadioButtonClicked(view: View){
        if(view is RadioButton){
            val checked = view.isChecked
        }
    }
}
