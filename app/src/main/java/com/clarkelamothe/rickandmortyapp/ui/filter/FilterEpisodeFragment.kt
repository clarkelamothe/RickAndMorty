package com.clarkelamothe.rickandmortyapp.ui.filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.clarkelamothe.rickandmortyapp.R
import com.clarkelamothe.rickandmortyapp.databinding.FragmentFilterEpisodeBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class FilterEpisodeFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentFilterEpisodeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilterEpisodeBinding.inflate(inflater, container, false)
        return binding.root
    }
}