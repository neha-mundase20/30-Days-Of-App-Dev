package com.example.weatherapplication

data class Forecast(
    val temperature: String,
    val wind: String,
    val description: String,
    val forecast: List<DayForecast>
)

data class DayForecast(
    val day: Int,
    val temperature: String,
    val wind: String
)
