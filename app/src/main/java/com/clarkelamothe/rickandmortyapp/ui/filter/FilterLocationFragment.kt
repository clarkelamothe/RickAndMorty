package com.clarkelamothe.rickandmortyapp.ui.filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.clarkelamothe.rickandmortyapp.databinding.FragmentFilterLocationBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class FilterLocationFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentFilterLocationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilterLocationBinding.inflate(inflater, container, false)
        return binding.root
    }
}