package com.clarkelamothe.rickandmortyapp.data.location

import com.clarkelamothe.rickandmortyapp.data.model.ApiResponse
import com.clarkelamothe.rickandmortyapp.data.model.Result
import retrofit2.Response
import retrofit2.http.GET

interface LocationService {
    @GET("location")
    suspend fun fetchLocation(): Response<ApiResponse<Result>>
}