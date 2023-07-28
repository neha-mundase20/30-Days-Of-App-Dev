package com.example.passingdatathroughscreens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch = findViewById<Switch>(R.id.OrderPreview)
        switch.setOnCheckedChangeListener { compoundButton, b ->

            val o1 = findViewById<EditText>(R.id.o1Text).editableText.toString()
            val o2 = findViewById<EditText>(R.id.o2Text).editableText.toString()
            val o3 = findViewById<EditText>(R.id.o3Text).editableText.toString()
            val o4 = findViewById<EditText>(R.id.o4Text).editableText.toString()

            val bundle = Bundle()
            bundle.putString("order1",o1)
            bundle.putString("order2",o2)
            bundle.putString("order3",o3)
            bundle.putString("order4",o4)


            val intent=Intent(this,OrdersPreviewPage::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}