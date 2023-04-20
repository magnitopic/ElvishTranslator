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
            Word("Rojo" ,"Caran", R.raw.rojo),
            Word("Carmín" ,"Carnin", R.raw.carmin),
            Word("Azul" ,"Luin", R.raw.azul),
            Word("Azul Marino" ,"Elu", R.raw.azul_marino),
            Word("Amarillo" ,"Malen", R.raw.amarillo),
            Word("Verde" ,"Calen", R.raw.amarillo),
            Word("Negro" ,"Morn", R.raw.amarillo),
            Word("Marrón oscuro" ,"Baran", R.raw.amarillo),
            Word("Marrón" ,"Rhosg", R.raw.amarillo),
            Word("Blanco" ,"Faen", R.raw.amarillo),
            Word("Pálido" ,"Nimp", R.raw.amarillo),
            Word("Gris" ,"Mith", R.raw.amarillo),
            Word("Naranja" ,"Cull", R.raw.amarillo),
            Word("Rosa" ,"Crinth", R.raw.amarillo),
            Word("Violeta" ,"Ling", R.raw.amarillo)
        )
        listaColores.adapter = WordArrayAdapter(applicationContext, R.layout.item_list_word, colores)
    }
}