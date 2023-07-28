package com.example.interactiveuiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lightButton=findViewById<Button>(R.id.btnLight)
        val darkButton=findViewById<Button>(R.id.btnDark)
        val layout=findViewById<LinearLayout>(R.id.LinearLayout)

        lightButton.setOnClickListener {
            layout.setBackgroundResource(R.color.peach)
        }
        darkButton.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }
    }
}