package com.clarkelamothe.rickandmorty.data.model


data class ApiResponse<T>(
    val info: Info,
    val results: List<Result>
)