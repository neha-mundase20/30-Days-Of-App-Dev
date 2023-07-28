package com.example.weatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getWeatherBtn = findViewById<Button>(R.id.getWeatherBtn)
        getWeatherBtn.setOnClickListener {
            val cityName = findViewById<EditText>(R.id.inputCity).text.toString()
            Log.d("City Name",cityName)
            var intent = (Intent(this,WeatherData::class.java))
            val bundle = Bundle()
            bundle.putString("cityName",cityName)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}