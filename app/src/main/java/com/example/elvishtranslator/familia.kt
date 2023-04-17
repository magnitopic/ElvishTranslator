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
            Word("Madre", "Naneth"),
            Word("Padre", "Adanadar"),
            Word("Hijo", "Ionn"),
            Word("Hija", "Sell"),
            Word("Hermano", "Muindor"),
            Word("Hermana", "Muinthel"),
            Word("Tío", "Athelas"),
            Word("Tía", "Nethwen"),
            Word("Abuelo", "Adaid"),
            Word("Abuela", "Nanaid")
        )
        listaFamilia.adapter = WordArrayAdapter(applicationContext, R.layout.item_list_word, familiares)
    }
}