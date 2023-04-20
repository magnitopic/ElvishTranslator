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
            Word("1", "mîn", R.raw.uno),
            Word("2", "tâd", R.raw.dos),
            Word("3", "nêl", R.raw.tres),
            Word("4", "canad", R.raw.cuatro),
            Word("5", "leben", R.raw.cinco),
            Word("6", "eneg", R.raw.cinco),
            Word("7", "odog", R.raw.cinco),
            Word("8", "tolodh", R.raw.cinco),
            Word("9", "neder", R.raw.cinco),
            Word("10", "pae", R.raw.cinco),
            Word("11", "minig", R.raw.cinco),
            Word("12", "uiug", R.raw.cinco),
            Word("13", "pae-a-nêl", R.raw.cinco),
            Word("14", "pae-a-canad", R.raw.cinco),
            Word("15", "pae-a-leben", R.raw.cinco),
            Word("16", "pae-ar-eneg", R.raw.cinco),
            Word("17", "pae-ar-odog", R.raw.cinco),
            Word("18", "pae-a-tolodh", R.raw.cinco),
            Word("19", "pae-a-neder", R.raw.cinco),
            Word("20", "taphae", R.raw.cinco),
            Word("30", "nelphae", R.raw.cinco),
            Word("40", "canaphae", R.raw.cinco),
            Word("50", "lephae", R.raw.cinco),
            Word("60", "enephae", R.raw.cinco),
            Word("70", "odophae", R.raw.cinco),
            Word("80", "tolophae", R.raw.cinco),
            Word("90", "nederphae", R.raw.cinco),
            Word("100", "haran", R.raw.cinco),
            Word("1000", "meneg", R.raw.cinco)
        )
        listaNumeros.adapter = WordArrayAdapter(applicationContext, R.layout.item_list_word, numeros)
    }
}