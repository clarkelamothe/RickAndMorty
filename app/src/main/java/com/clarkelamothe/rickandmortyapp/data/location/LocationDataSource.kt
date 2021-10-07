package com.clarkelamothe.rickandmortyapp.data.location

import com.clarkelamothe.rickandmortyapp.BaseDataSource
import javax.inject.Inject

class LocationDataSource @Inject constructor(private val locationService: LocationService) :
    BaseDataSource() {
    suspend fun getLocations() = getResult { locationService.fetchLocation() }
}