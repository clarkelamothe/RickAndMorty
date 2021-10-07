package com.clarkelamothe.rickandmortyapp.ui.character

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clarkelamothe.rickandmortyapp.R
import com.clarkelamothe.rickandmortyapp.databinding.FragmentCharacterBinding

class CharacterFragment : Fragment() {
    private lateinit var binding: FragmentCharacterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCharacterBinding.inflate(inflater, container, false)

        return binding.root
    }

}