package com.example.elvishtranslator

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class frases : AppCompatActivity() {
    private lateinit var listaFrases: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frases)
        listaFrases = findViewById<ListView>(R.id.listaFrases)

        var frases = arrayListOf<Word>(
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem),
            Word("Lorem ipsum dolor sit amet" ,"", R.raw.lorem)
        )
        listaFrases.adapter = FrasesWordAdapter(applicationContext, R.layout.item_list_word, frases)
    }



}