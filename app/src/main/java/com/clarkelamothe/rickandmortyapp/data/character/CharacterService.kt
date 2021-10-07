package com.clarkelamothe.rickandmortyapp.data.character

import com.clarkelamothe.rickandmortyapp.data.model.ApiResponse
import com.clarkelamothe.rickandmortyapp.data.model.Result
import retrofit2.Response
import retrofit2.http.GET

interface CharacterService {
    @GET("character")
    suspend fun fetchCharacter(): Response<ApiResponse<Result>>
}