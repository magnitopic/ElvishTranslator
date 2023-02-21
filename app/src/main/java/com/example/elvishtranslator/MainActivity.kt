package com.example.elvishtranslator

import android.content.Intent
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
    }

    fun setupListeners() {
        findViewById<TextView>(R.id.textView).setOnClickListener {
            var i = Intent(this, numeros::class.java)
            startActivity(i)
        }
        findViewById<TextView>(R.id.textView2).setOnClickListener {
            var i = Intent(this, familia::class.java)
            startActivity(i)
        }
        findViewById<TextView>(R.id.textView3).setOnClickListener {
            var i = Intent(this, numeros::class.java)
            startActivity(i)
        }
        findViewById<TextView>(R.id.textView4){

        }
    }

    fun changeView(vista: View) {
        if (vista.id == R.id.textView) {
        } else if (vista.id == R.id.textView2) {
            var i = Intent(this, familia::class.java)
            startActivity(i)
        } else if (vista.id == R.id.textView3) {
            var i = Intent(this, colores::class.java)
            startActivity(i)
        } else if (vista.id == R.id.textView4) {
            var i = Intent(this, numeros::class.java)
            startActivity(i)
        }
    }
}