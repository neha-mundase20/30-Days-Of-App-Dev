package com.example.recyclerviewimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView:RecyclerView
    lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView=findViewById(R.id.recyclerView)

        var newsImageIdArray= arrayOf(
            R.drawable.news_image_1,
            R.drawable.news_image_2,
            R.drawable.news_image_3,
            R.drawable.news_image_4
        )

        var newsHeadingArray= arrayOf(
            "Coronavirus","Coronavirus","Coronavirus","Coronavirus"
        )

        myRecyclerView.layoutManager=LinearLayoutManager(this)
        //decides the scrolling style i.e. vertically, horizontally, grid layout, etc.
        newsArrayList= arrayListOf<News>()

        for(index in newsHeadingArray.indices){
            val news = News(newsHeadingArray[index],newsImageIdArray[index])
            newsArrayList.add(news)
        }

        myRecyclerView.adapter=myAdapter(this,newsArrayList)
    }
}