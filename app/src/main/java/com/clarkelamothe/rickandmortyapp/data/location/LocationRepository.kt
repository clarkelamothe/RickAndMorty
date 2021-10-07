package com.clarkelamothe.rickandmortyapp.data.location

import javax.inject.Inject

class LocationRepository @Inject constructor(private val locationDataSource: LocationDataSource) {
    suspend fun locations() = locationDataSource.getLocations()
}