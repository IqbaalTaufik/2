package com.example.tampilanutama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_registrasi.*

const val EXTRA_MESSAGE = "com.example.mainmenu.MESSAGE"
class registrasi : AppCompatActivity() {
private lateinit var btn : Button
    private lateinit var btn2 : Button
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

            tulbar.setNavigationIcon(R.drawable.ic_header_back)
            btn = findViewById(R.id.tmbl1)
            btn.setOnClickListener{
                val t1 = findViewById<EditText>(R.id.editText3)
                val msg = t1.text.toString()
                val t2 = findViewById<Spinner>(R.id.spdarah)
                if(msg.isEmpty())
                {
                    t1.setError("Username tidak boleh kosong!")
                }
                else {
                    val intent = Intent(this, profil::class.java).apply {
                        putExtra(EXTRA_MESSAGE,msg)
                    }
                }
                startActivity(Intent(this, selaid3::class.java))
                }
        tulbar.setNavigationIcon(R.drawable.ic_header_back)

    }
    fun onRadioButtonClicked(view: View){
        if(view is RadioButton){
            val checked = view.isChecked
        }
    }
}
