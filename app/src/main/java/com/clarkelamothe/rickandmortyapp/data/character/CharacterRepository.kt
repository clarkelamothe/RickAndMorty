package com.clarkelamothe.rickandmortyapp.data.character

import javax.inject.Inject

class CharacterRepository @Inject constructor(private val characterDataSource: CharacterDataSource) {
    suspend fun characters() = characterDataSource.getCharacters()
}