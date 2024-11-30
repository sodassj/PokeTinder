package com.david.maldonado.poketinder.data.network

import com.david.maldonado.poketinder.data.model.PokemonListResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {

    @GET("api/v2/pokemon")
    suspend fun getPokemons(): Response<PokemonListResponse>
}