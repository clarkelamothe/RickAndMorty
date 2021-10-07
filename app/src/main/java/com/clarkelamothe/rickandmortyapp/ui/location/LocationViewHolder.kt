package com.clarkelamothe.rickandmortyapp.ui.location

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.clarkelamothe.rickandmortyapp.data.model.Result
import com.clarkelamothe.rickandmortyapp.databinding.CardLocationBinding

class LocationViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = CardLocationBinding.bind(view)

    private val type = binding.tvLocationCaption
    private val name = binding.tvLocationSubtitle

    fun bind(character: Result) {
        type.text = character.type
        name.text = character.name
    }
}
