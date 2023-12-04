package com.yago.primera_practica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.yago.myapplication.R
import com.yago.primera_practica.ui.theme.RespuestaActivity

/**
 * meter 2 toast
 * 2 alert dialog
 * 2 datepiker dialog
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val boton = findViewById<Button>(R.id.boton)


       boton.setOnClickListener {
            var nombre = etNombre.text.toString()
            val intent = Intent(this, RespuestaActivity::class.java)
           if(nombre.isEmpty()){
               Toast.makeText(this,"No estas poniento ningun texto", Toast.LENGTH_SHORT).show()
           } else{
               intent.putExtra("EXTRA_NOMBRE", nombre)
               startActivity(intent)
           }
        }





    }

    /*Funcion que solo se usa en el ejemplo comentado arriba*/
    fun respuesta(nombre: String){
        setContentView(R.layout.second_layout)
        val respuesta = findViewById<TextView>(R.id.txRespuesta)
        respuesta.text = "Hola $nombre"


    }
}

