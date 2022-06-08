package com.vargasandres.clase08_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //declaracion de un boton
    lateinit var btnSaludo : Button

    var btnSaludo2 : Button? = null
    var btnSaludo3 : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inicializacion de contenido

        inicializacionBotones()
        saludosBotones(btnSaludo)


        //ebentos clic
       // btnSaludo.setOnClickListener{
         //   Toast.makeText(this, "Saludo Andres", Toast.LENGTH_LONG).show()

        }

    fun inicializacionBotones(){
        btnSaludo = findViewById(R.id.btnSaludo)
    }
    fun saludosBotones(button: Button){
        button.setOnClickListener{
            Toast.makeText(this, "Saludo Andres 1", Toast.LENGTH_LONG).show()
        }
    }
}



