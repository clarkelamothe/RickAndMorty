package com.clarkelamothe.rickandmortyapp.ui.location

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.clarkelamothe.rickandmortyapp.Resource
import com.clarkelamothe.rickandmortyapp.databinding.FragmentLocationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LocationFragment : Fragment() {
    private lateinit var binding: FragmentLocationBinding
    private val locationViewModel: LocationViewModel by viewModels()

    private lateinit var locationAdapter: LocationAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLocationBinding.inflate(inflater, container, false)

        locationViewModel.locationResult.observe(viewLifecycleOwner, {
            when (it.status) {
                Resource.Status.LOADING -> {
                }
                Resource.Status.SUCCESS -> {
                    locationAdapter = LocationAdapter(it.data!!)
                    binding.rvLocations.adapter = locationAdapter
                }
                Resource.Status.ERROR -> {
                    Toast.makeText(context, "Error Loading Locations", Toast.LENGTH_SHORT).show()
                }
            }
        })
        return binding.root
    }

}