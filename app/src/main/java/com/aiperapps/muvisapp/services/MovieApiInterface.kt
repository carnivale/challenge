package com.aiperapps.muvisapp.services

import com.aiperapps.muvisapp.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET


interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=b197e79e894418a131f1aa8851a91535")
    fun getMovieList(): Call<MovieResponse>
}