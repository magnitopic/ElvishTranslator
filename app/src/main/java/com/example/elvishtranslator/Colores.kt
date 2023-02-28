package com.example.elvishtranslator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class Colores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colores)
        val listaColores = findViewById<ListView>(R.id.lista_colores)

        var colores= arrayListOf<String>(
            "Rojo",
            "Azul",
            "Verede",
            "Marrón",
            "Fuxia",
            "Morado",
            "Granate",
            "Amarillo",
            "Rosa",
            "Beige"
        )
        listaColores.adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, colores)
    }
}