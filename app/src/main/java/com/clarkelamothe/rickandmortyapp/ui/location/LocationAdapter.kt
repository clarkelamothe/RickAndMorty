package com.clarkelamothe.rickandmortyapp.ui.location

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.clarkelamothe.rickandmortyapp.R
import com.clarkelamothe.rickandmortyapp.data.model.Result

class LocationAdapter(
    private var locations: List<Result>
) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_location, parent, false)
        return LocationViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder as LocationViewHolder).bind(locations[position])
    }

    override fun getItemCount(): Int = locations.size
}