package com.clarkelamothe.rickandmortyapp.ui.location

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clarkelamothe.rickandmortyapp.R
import com.clarkelamothe.rickandmortyapp.databinding.FragmentLocationBinding

class LocationFragment : Fragment() {
    private lateinit var binding: FragmentLocationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLocationBinding.inflate(inflater, container, false)
        return binding.root
    }

}