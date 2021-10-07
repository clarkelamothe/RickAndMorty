package com.clarkelamothe.rickandmortyapp.data.episode

import javax.inject.Inject

class EpisodeRepository @Inject constructor(private val episodeDataSource: EpisodeDataSource) {
    suspend fun episodes() = episodeDataSource.getEpisodes()
}