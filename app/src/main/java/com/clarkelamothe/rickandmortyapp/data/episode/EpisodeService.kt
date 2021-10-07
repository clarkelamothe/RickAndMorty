package com.clarkelamothe.rickandmortyapp.data.episode

import com.clarkelamothe.rickandmortyapp.data.model.ApiResponse
import com.clarkelamothe.rickandmortyapp.data.model.Result
import retrofit2.Response
import retrofit2.http.GET

interface EpisodeService {
    @GET("episode")
    suspend fun fetchEpisodes(): Response<ApiResponse<Result>>
}