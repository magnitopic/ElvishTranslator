package com.example.elvishtranslator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class frases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frases)
        val listaFrases = findViewById<ListView>(R.id.listaFrases)

        var frases= arrayListOf<String>(
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. ",
            "Lorem ipsum dolor sit amet, consectetur adipiscing. "
        )
        listaFrases.adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, frases)
    }
}