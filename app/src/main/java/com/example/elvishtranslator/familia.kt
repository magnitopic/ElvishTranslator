package com.example.elvishtranslator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class familia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_familia)

        val listaFamilia = findViewById<ListView>(R.id.listaFamilia)
        var familiares= arrayListOf<Word>(
            Word("Madre", "Naneth", R.raw.madre),
            Word("Padre", "Adanadar", R.raw.padre),
            Word("Hijo", "Ionn", R.raw.hijo),
            Word("Hija", "Sell", R.raw.hija),
            Word("Hermano", "Muindor", R.raw.hermano),
            Word("Hermana", "Muinthel", R.raw.hermano),
            Word("Tío", "Athelas", R.raw.hermano),
            Word("Tía", "Nethwen", R.raw.hermano),
            Word("Abuelo", "Adaid", R.raw.hermano),
            Word("Abuela", "Nanaid", R.raw.hermano)
        )
        listaFamilia.adapter = WordArrayAdapter(applicationContext, R.layout.item_list_word, familiares)
    }
}