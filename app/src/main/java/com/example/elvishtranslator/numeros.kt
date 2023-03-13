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

        var numeros= arrayListOf<Word>(
            Word("1", "mîn"),
            Word("1", "mîn"),
            Word("2", "tâd"),
            Word("3", "nêl"),
            Word("4", "canad"),
            Word("5", "leben"),
            Word("6", "eneg"),
            Word("7", "odog"),
            Word("8", "tolodh"),
            Word("9", "neder"),
            Word("10", "pae"),
            Word("11", "minig"),
            Word("12", "uiug"),
            Word("13", "pae-a-nêl"),
            Word("14", "pae-a-canad"),
            Word("15", "pae-a-leben"),
            Word("16", "pae-ar-eneg"),
            Word("17", "pae-ar-odog"),
            Word("18", "pae-a-tolodh"),
            Word("19", "pae-a-neder"),
            Word("20", "taphae"),
            Word("30", "nelphae"),
            Word("40", "canaphae"),
            Word("50", "lephae"),
            Word("60", "enephae"),
            Word("70", "odophae"),
            Word("80", "tolophae"),
            Word("90", "nederphae"),
            Word("100", "haran"),
            Word("1000", "meneg")
        )
        listaNumeros.adapter = WordArrayAdapter(applicationContext, R.layout.item_list_word, numeros)
    }
}