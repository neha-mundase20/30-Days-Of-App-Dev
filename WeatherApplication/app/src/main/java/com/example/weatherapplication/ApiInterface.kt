package com.example.weatherapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

const val BASE_URL = "https://goweather.herokuapp.com"

interface ApiInterface {

    @GET("/weather/{city}")
    fun getWeatherData(@Path("city") city: String): Call<Forecast>

}