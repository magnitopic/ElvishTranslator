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
            Word("Rojo" ,"Caran"),
            Word("Carmín" ,"Carnin"),
            Word("Azul" ,"Luin"),
            Word("Azul Marino" ,"Elu"),
            Word("Amarillo" ,"Malen"),
            Word("Verde" ,"Calen"),
            Word("Negro" ,"Morn"),
            Word("Marrón oscuro" ,"Baran"),
            Word("Marrón" ,"Rhosg"),
            Word("Blanco" ,"Faen"),
            Word("Pálido" ,"Nimp"),
            Word("Gris" ,"Mith"),
            Word("Naranja" ,"Cull"),
            Word("Rosa" ,"Crinth"),
            Word("Violeta" ,"Ling")
        )
        listaColores.adapter = WordArrayAdapter(applicationContext, R.layout.item_list_word, colores)
    }
}