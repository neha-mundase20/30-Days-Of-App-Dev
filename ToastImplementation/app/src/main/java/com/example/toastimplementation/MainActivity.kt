package com.example.toastimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onDownloadClicked(view: View) {
        Log.d("Toast","Download Button Clicked !") //debug log message
        Toast.makeText(this@MainActivity,"Downloading...",Toast.LENGTH_SHORT).show()
    }
    fun onUploadClicked(view: View) {
        Log.d("Toast","Upload Button Clicked !")
        Toast.makeText(this@MainActivity,"Uploading...",Toast.LENGTH_SHORT).show()
    }
}