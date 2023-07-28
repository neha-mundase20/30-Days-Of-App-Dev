package com.example.recyclerviewimplementation_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var recyclerView: RecyclerView
lateinit var foodArrayList: ArrayList<foodCatalog>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageArray = arrayOf(
            R.drawable.food1, R.drawable.food2, R.drawable.food3,
            R.drawable.food4, R.drawable.food5, R.drawable.food6
        )

        val textArray =
            arrayOf("Burger", "Pancakes", "Indian Cuisine", "Avocado Toast", "Omlette", "Pasta")

        foodArrayList = arrayListOf<foodCatalog>()

        for (index in textArray.indices) {
            val obj = foodCatalog(imageArray[index], textArray[index])
            foodArrayList.add(obj)
        }

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = myAdapter(this, foodArrayList)
    }
}