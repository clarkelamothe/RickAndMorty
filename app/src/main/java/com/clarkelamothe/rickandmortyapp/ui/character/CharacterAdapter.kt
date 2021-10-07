package com.clarkelamothe.rickandmortyapp.ui.character

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.clarkelamothe.rickandmortyapp.R
import com.clarkelamothe.rickandmortyapp.data.model.Result

class CharacterAdapter(
    private var characters: List<Result>
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_character, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder as CharacterViewHolder).bind(characters[position])
    }

    override fun getItemCount(): Int = characters.size
}