package com.example.intentsimplementation

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View) {
        val intent = Intent(this@MainActivity,MainActivity2::class.java)
        startActivity(intent)
    }

    fun githubCardClicked(view: View) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse("https://github.com/neha-mundase20")
        startActivity(intent)

    }
    fun cameraCardClicked(view: View) {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent)
    }
}