package com.example.passingdatathroughscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrdersPreviewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders_preview_page)

        val orders=intent.extras
        if(orders!=null){
            val o1= orders.getString("order1")
            val o2= orders.getString("order2")
            val o3= orders.getString("order3")
            val o4= orders.getString("order4")

            val order="1. $o1" +
                    "2. $o2" +
                    "3. $o3" +
                    "4. $o4"

            val orderText=findViewById<TextView>(R.id.orderText)
            orderText.text= order
        }
    }
}