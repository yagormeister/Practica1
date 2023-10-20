package com.yago.primera_practica.ui.theme

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yago.myapplication.R
import com.yago.primera_practica.ui.theme.ui.theme.Primera_PracticaTheme

class RespuestaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val vtRespuesta = findViewById<TextView>(R.id.txRespuesta)
        val respuesta =  intent.extras?.getString("EXTRA_NOMBRE").orEmpty()
        vtRespuesta.text = "Hola $respuesta¡¡"



        }
    }

