package com.clarkelamothe.rickandmortyapp.data.character

import com.clarkelamothe.rickandmortyapp.BaseDataSource
import javax.inject.Inject

class CharacterDataSource @Inject constructor(private val characterService: CharacterService) :
    BaseDataSource() {
    suspend fun getCharacters() = getResult { characterService.fetchCharacter() }
}