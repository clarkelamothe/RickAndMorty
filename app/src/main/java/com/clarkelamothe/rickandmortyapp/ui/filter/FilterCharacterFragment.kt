package com.clarkelamothe.rickandmortyapp.ui.filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.clarkelamothe.rickandmortyapp.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class FilterCharacterFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_filter_character, container, false)
    }
}