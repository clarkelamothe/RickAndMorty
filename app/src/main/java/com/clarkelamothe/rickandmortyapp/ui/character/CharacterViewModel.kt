package com.clarkelamothe.rickandmortyapp.ui.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.clarkelamothe.rickandmortyapp.Resource
import com.clarkelamothe.rickandmortyapp.data.character.CharacterRepository
import com.clarkelamothe.rickandmortyapp.data.model.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {
    private val _characterResult = MutableLiveData<Resource<List<Result>>>()
    val characterResult: LiveData<Resource<List<Result>>> = _characterResult


    init {
        getCharacterResponse()
    }

    private fun getCharacterResponse() = viewModelScope.launch(Dispatchers.Main) {
        _characterResult.value = Resource.loading()
        val result = withContext(Dispatchers.IO) { characterRepository.characters() }
        _characterResult.value = result
    }
}