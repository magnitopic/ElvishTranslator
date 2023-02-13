package com.example.elvishtranslator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeView(vista: View){
        if (vista.id == R.id.textView){
            var i = Intent(this, numeros::class.java)
            startActivity(i)
        }else if (vista.id == R.id.textView2){
            var i =  Intent(this, familia::class.java)
            startActivity(i)
        }else if (vista.id == R.id.textView3){
            var i =  Intent(this, colores::class.java)
            startActivity(i)
        }else if (vista.id == R.id.textView4){
            var i =  Intent(this, numeros::class.java)
            startActivity(i)
        }
    }
}