package com.clarkelamothe.rickandmortyapp.data.episode

import com.clarkelamothe.rickandmortyapp.BaseDataSource
import javax.inject.Inject

class EpisodeDataSource @Inject constructor(private val episodeService: EpisodeService) :
    BaseDataSource() {
    suspend fun getEpisodes() = getResult { episodeService.fetchEpisodes() }
}