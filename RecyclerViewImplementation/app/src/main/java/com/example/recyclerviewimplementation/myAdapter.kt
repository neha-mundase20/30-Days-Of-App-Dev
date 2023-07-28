package com.example.recyclerviewimplementation

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class myAdapter(var context:Activity,var newsArrayList:ArrayList<News>):RecyclerView.Adapter<myAdapter.myViewHolder>(){

    //holds all the views. Views have a title and a image, so get these over here
    class myViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val hTitle = itemView.findViewById<TextView>(R.id.tvHeading)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.headingImage)
    }

    //to create a new view when the layout manager fails to fina a view for a suitable item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter.myViewHolder{
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.data_item,parent,false)
        return myViewHolder(itemView)
    }

    //populate items with data
    override fun onBindViewHolder(holder: myAdapter.myViewHolder, position: Int) {
        var currentItem = newsArrayList[position]
        holder.hTitle.text=currentItem.newsHeading
        holder.hImage.setImageResource(currentItem.newsImageId)
    }

    //itemCount is obtained from our arrayList size where our data is stored
    override fun getItemCount(): Int {
        return newsArrayList.size
    }
}