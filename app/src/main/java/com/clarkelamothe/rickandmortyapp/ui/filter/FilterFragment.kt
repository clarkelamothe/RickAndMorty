package com.clarkelamothe.rickandmortyapp.ui.filter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.clarkelamothe.rickandmortyapp.databinding.FragmentFilterBinding

class FilterFragment : Fragment() {
    private lateinit var binding: FragmentFilterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilterBinding.inflate(inflater, container, false)
        return binding.root
    }

}