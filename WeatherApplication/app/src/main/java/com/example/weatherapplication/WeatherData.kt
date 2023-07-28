package com.example.weatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response

lateinit var recyclerView: RecyclerView
private lateinit var dataInstance:DataInterface

class WeatherData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_data)

        val bundle = intent.extras
        val cityName = bundle?.getString("cityName")
        Log.d("City Name",cityName.toString())

        val temp=findViewById<TextView>(R.id.temperature)
        val wind=findViewById<TextView>(R.id.wind)
        val desc=findViewById<TextView>(R.id.description)

        dataInstance = DataInterface()    //retrofit builder object is created

        val data = dataInstance.getApiService().getWeatherData(cityName.toString())

        Log.d("Weather", data.toString())

        data.enqueue(object : retrofit2.Callback<Forecast> {
            override fun onResponse(call: Call<Forecast>, response: Response<Forecast>) {
                if (response.isSuccessful) {
                    // Handle the successful response here
                    val forecast = response.body()

                    Log.d("Weather",response.toString())
                    // Do something with the forecast data

                    if(forecast != null){
                        temp.text=forecast.temperature
                        wind.text=forecast.wind
                        desc.text=forecast.description
                    }

                    //recyclerView.adapter=ForecastDataAdapter(this@WeatherData, forecast)
                } else {
                    Log.d("Weather",response.toString())
                    Toast.makeText(this@WeatherData,"Please Try Again!",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@WeatherData,MainActivity::class.java)
                    startActivity(intent)
                }
            }

            override fun onFailure(call: Call<Forecast>, t: Throwable) {
                Toast.makeText(this@WeatherData,"Please Try Again!",Toast.LENGTH_SHORT).show()
                val intent = Intent(this@WeatherData,MainActivity::class.java)
                startActivity(intent)
            }
        })

    }
}

