package com.clarkelamothe.rickandmortyapp.ui.episode

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.clarkelamothe.rickandmortyapp.R
import com.clarkelamothe.rickandmortyapp.databinding.FragmentEpisodeBinding

class EpisodeFragment : Fragment() {
    private lateinit var binding: FragmentEpisodeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEpisodeBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_top, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.Filter -> {
                findNavController().navigate(R.id.goToFilterEpisode)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}