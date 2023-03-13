package com.example.elvishtranslator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class WordArrayAdapter(context: Context, viewToPaint: Int, private val wordList: ArrayList<Word>) :
    ArrayAdapter<Word>(context, viewToPaint, wordList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val currentListItem = inflater.inflate(R.layout.item_list_word, null)

        val spanishText = currentListItem.findViewById<TextView>(R.id.textViewSpanish)
        val elvishText = currentListItem.findViewById<TextView>(R.id.textViewElvish)

        spanishText.text = wordList.get(position).spanish
        elvishText.text = wordList.get(position).elvish

        return currentListItem
    }
}