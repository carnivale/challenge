package com.aiperapps.muvisapp.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface MovieApiService {
    companion object{
        private const val BASE_URL = "https://api.themoviedb.org/3/"
        private var retrofit : Retrofit? = null

        fun getInstance() : Retrofit{
            if (retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}
