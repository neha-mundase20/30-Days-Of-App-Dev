package com.example.listviewimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList:ArrayList<userData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemText =ArrayList<String>()
        itemText.add("Neha")
        itemText.add("Nandini")
        itemText.add("Kaivalya")
        itemText.add("Kartikeya")

        val description=ArrayList<String>()
        description.add("Hey! Can we catch up this Sunday?")
        description.add("I am booking your appointment with the doctor next week.")
        description.add("Bring your notebook tomorrow for reference.")
        description.add("Are you participating in the competition next week?")

        val imageId= intArrayOf(R.drawable.profile_picture_1,R.drawable.profile_picture_3,R.drawable.profile_picture_2,R.drawable.profile_picture_4)

        userArrayList=ArrayList()

        for(i in itemText.indices){
            var user=userData(itemText[i],description[i],imageId[i])
            userArrayList.add(user)
        }

        val listView=findViewById<ListView>(R.id.ListView)
        listView.adapter=ListViewAdapter(this,userArrayList)
    }
}