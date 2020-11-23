package com.example.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("SecondActivity","onCreate called")
    }
    override fun onStart() {
        super.onStart()
        Log.i("SecondActivity", "onStart Called")

    }

    override fun onResume() {
        super.onResume()
        Log.i("SecondActivity", "onResume Called")

    }

    override fun onPause() {
        super.onPause()
        Log.i("SecondActivity", "onPause Called")

    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondActivity", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SecondActivity", "onDestroy Called")
    }
}