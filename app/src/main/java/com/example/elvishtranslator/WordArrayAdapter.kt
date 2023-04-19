package com.example.elvishtranslator

import android.content.Context
import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class WordArrayAdapter(context: Context, viewToPaint: Int, private val wordList: ArrayList<Word>) :
    ArrayAdapter<Word>(context, viewToPaint, wordList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val currentListItem = inflater.inflate(R.layout.item_list_word, null)
        val playAudioButton = currentListItem.findViewById<ImageView>(R.id.playIcon)
        val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.my_audio_file)


        val spanishText = currentListItem.findViewById<TextView>(R.id.textViewSpanish)
        val elvishText = currentListItem.findViewById<TextView>(R.id.textViewElvish)

        spanishText.text = wordList.get(position).spanish
        elvishText.text = wordList.get(position).elvish
        playAudioButton.setImageResource(R.drawable.play)

        currentListItem.setOnClickListener {
            Log.d("TAG", "Lista presionada")
        }

        return currentListItem
    }
}