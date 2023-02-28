package com.example.elvishtranslator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class numeros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numeros)
        val listaNumeros = findViewById<ListView>(R.id.listaNumeros)

        var numeros= arrayListOf<String>(
            "Uno ",
            "Dos",
            "Tres",
            "Cuatro",
            "Cinco",
            "Seis",
            "Siete",
            "Ocho",
            "Nueve",
            "Diez"
        )
        listaNumeros.adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, numeros)
    }
}