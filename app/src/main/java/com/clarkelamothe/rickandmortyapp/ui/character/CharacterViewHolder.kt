package com.clarkelamothe.rickandmortyapp.ui.character

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.clarkelamothe.rickandmortyapp.data.model.Result
import com.clarkelamothe.rickandmortyapp.databinding.CardCharacterBinding
import com.squareup.picasso.Picasso

class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = CardCharacterBinding.bind(view)

    val image = binding.ivCharacterImage
    val caption = binding.tvCharacterCaption
    val subtitle = binding.tvCharacterSubtitle

    fun bind(character: Result) {
        Picasso.get().load(character.image).into(image)
        caption.text = character.status
        subtitle.text = character.name
    }
}
