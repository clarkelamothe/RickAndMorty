package com.clarkelamothe.rickandmortyapp.ui.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.clarkelamothe.rickandmortyapp.Resource
import com.clarkelamothe.rickandmortyapp.data.location.LocationRepository
import com.clarkelamothe.rickandmortyapp.data.model.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class LocationViewModel @Inject constructor(
    private val locationRepository: LocationRepository
) : ViewModel() {
    private val _locationResult = MutableLiveData<Resource<List<Result>>>()
    val locationResult: LiveData<Resource<List<Result>>> = _locationResult

    init {
        getLocationResponse()
    }

    private fun getLocationResponse() = viewModelScope.launch(Dispatchers.Main) {
        _locationResult.value = Resource.loading()
        val result = withContext(Dispatchers.IO) { locationRepository.locations() }
        _locationResult.value = result
    }
}