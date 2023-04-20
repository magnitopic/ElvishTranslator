package com.example.elvishtranslator

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FrasesWordAdapter(context: Context, viewToPaint: Int, private val wordList: ArrayList<Word>) :
        ArrayAdapter<Word>(context, viewToPaint, wordList) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val inflater = LayoutInflater.from(context)
            val currentListItem = inflater.inflate(R.layout.item_list_frase, null)
            val playAudioButton = currentListItem.findViewById<ImageView>(R.id.playIcon)
            val mediaPlayer = MediaPlayer.create(context, wordList.get(position).audio)


            val spanishText = currentListItem.findViewById<TextView>(R.id.textViewSpanish)

            spanishText.text = wordList.get(position).spanish
            playAudioButton.setImageResource(R.drawable.play)

            currentListItem.setOnClickListener {
                mediaPlayer?.start()
            }

            return currentListItem
        }
    }