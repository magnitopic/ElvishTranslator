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
        var familiares= arrayListOf<String>(
            "Mama",
            "Papa",
            "Hermano",
            "Hermana",
            "Abuelo",
            "Abuela",
            "Prima",
            "Primo",
            "Tia",
            "Tio"
        )
        listaFamilia.adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, familiares)
    }
}