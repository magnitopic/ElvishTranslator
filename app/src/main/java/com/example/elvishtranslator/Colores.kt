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

        var colores = arrayListOf<Word>(
            Word("Rojo", "Turpis"),
            Word("Azul","Turpis"),
            Word("Verede","Turpis"),
            Word("Marrón","Turpis"),
            Word("Fuxia","Turpis"),
            Word("Morado","Turpis"),
            Word("Granate","Turpis"),
            Word("Amarillo","Turpis"),
            Word("Rosa","Turpis"),
            Word("Beige","Turpis")
        )
        listaColores.adapter = ArrayAdapter<Word>(applicationContext, android.R.layout.simple_list_item_1, colores)
    }
}