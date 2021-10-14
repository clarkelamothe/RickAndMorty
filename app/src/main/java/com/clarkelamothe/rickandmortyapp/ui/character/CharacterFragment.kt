package com.clarkelamothe.rickandmortyapp.ui.character

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.clarkelamothe.rickandmortyapp.R
import com.clarkelamothe.rickandmortyapp.Resource
import com.clarkelamothe.rickandmortyapp.databinding.FragmentCharacterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharacterFragment : Fragment() {
    private lateinit var binding: FragmentCharacterBinding
    private lateinit var characterAdapter: CharacterAdapter
    private val characterViewModel: CharacterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterBinding.inflate(inflater, container, false)

        characterViewModel.characterResult.observe(viewLifecycleOwner, {
            when (it.status) {
                Resource.Status.LOADING -> {
                }
                Resource.Status.SUCCESS -> {
                    characterAdapter = CharacterAdapter(it.data!!)
                    binding.rvCharacters.adapter = characterAdapter
                }
                Resource.Status.ERROR -> {
                    Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
                }
            }
        })

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
                findNavController().navigate(R.id.goToFilterCharacter)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}