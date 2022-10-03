package com.example.teste1

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.welcome, Toast.LENGTH_SHORT).show()
    }
/*
    override fun onStart() {
        super.onStart()
        Log.d("Tag", "onStart")
        /// LOG MESSAGE
    }

    override fun onResume() {
        super.onResume()
        Log.d("Tag", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Tag", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Tag", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tag", "onDestroy")
    }
    */

}
