package com.example.elvishtranslator

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListeners()
        val face: Typeface = Typeface.createFromAsset(assets, "fonts/RichardSamuels.otf")
        val mainTitle: TextView = findViewById(R.id.mainTitle)
        mainTitle.typeface = face
        findViewById<TextView>(R.id.numbersButton).typeface = face
        findViewById<TextView>(R.id.familyButton).typeface = face
        findViewById<TextView>(R.id.coloursButton).typeface = face
        findViewById<TextView>(R.id.phrasesButton).typeface = face
    }

    fun setupListeners() {
        findViewById<TextView>(R.id.numbersButton).setOnClickListener {
            var i = Intent(this, numeros::class.java)
            startActivity(i)
        }
        findViewById<TextView>(R.id.familyButton).setOnClickListener {
            var i = Intent(this, familia::class.java)
            startActivity(i)
        }
        findViewById<TextView>(R.id.coloursButton).setOnClickListener {
            var i = Intent(this, Colores::class.java)
            startActivity(i)
        }
        findViewById<TextView>(R.id.phrasesButton).setOnClickListener {
            var i = Intent(this, frases::class.java)
            startActivity(i)
        }
    }
}