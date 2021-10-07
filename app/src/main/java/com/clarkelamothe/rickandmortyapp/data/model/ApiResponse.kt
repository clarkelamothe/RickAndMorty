package com.clarkelamothe.rickandmortyapp.data.model


data class ApiResponse<T>(
    val info: Info,
    val results: List<Result>
)