package com.clarkelamothe.rickandmortyapp.di

import com.clarkelamothe.rickandmortyapp.data.character.CharacterDataSource
import com.clarkelamothe.rickandmortyapp.data.character.CharacterService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    private val API_URL = "https://rickandmortyapi.com/api/"

    @ApiRickAndMorty
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient) = Retrofit.Builder()
        .baseUrl(API_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    @Provides
    fun provideOkHttpClient() = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    @Provides
    fun provideCharacterService(@ApiRickAndMorty retrofit: Retrofit) =
        retrofit.create(CharacterService::class.java)

    @Provides
    fun provideCharacterDataSource(characterService: CharacterService): CharacterDataSource {
        return CharacterDataSource(characterService)
    }
}