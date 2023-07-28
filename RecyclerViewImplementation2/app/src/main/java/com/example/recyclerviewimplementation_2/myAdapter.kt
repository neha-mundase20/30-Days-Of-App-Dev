package com.example.recyclerviewimplementation_2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdapter(var context:Activity,var foodArrayList: ArrayList<foodCatalog>):
    RecyclerView.Adapter<myAdapter.myViewHolder>() {

    class myViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var img = itemView.findViewById<ImageView>(R.id.Image)
        var txt = itemView.findViewById<TextView>(R.id.Text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter.myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.data_items,parent,false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myAdapter.myViewHolder, position: Int) {
        var currentItem=foodArrayList[position]
        holder.img.setImageResource(currentItem.image)
        holder.txt.text=currentItem.text
    }

    override fun getItemCount(): Int {
        return foodArrayList.size
    }
}