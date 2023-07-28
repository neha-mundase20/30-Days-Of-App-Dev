package com.example.weatherapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ForecastDataAdapter(val context: Context, var forecast: List<DayForecast>)
    : RecyclerView.Adapter<ForecastDataAdapter.ViewHolder>() {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var day_card = itemView.findViewById<TextView>(R.id.day_card)
        var temp_card = itemView.findViewById<TextView>(R.id.temperature_card)
        var wind_card = itemView.findViewById<TextView>(R.id.wind_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastDataAdapter.ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.data_items,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var currentItem=forecast[position]
        holder.day_card.text = currentItem.day.toString()
        holder.temp_card.text=currentItem.temperature
        holder.wind_card.text=currentItem.wind
    }

    override fun getItemCount(): Int {
        return forecast.size
    }

}
