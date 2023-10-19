package com.yago.primera_practica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.yago.myapplication.R
import com.yago.primera_practica.ui.theme.RespuestaActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val boton = findViewById<Button>(R.id.boton)

        boton.setOnClickListener {
            var nombre = etNombre.text.toString()
            val intent = Intent(this, RespuestaActivity::class.java)
            intent.putExtra("EXTRA_NOMBRE", nombre)
            startActivity(intent)
        }




    }
}

