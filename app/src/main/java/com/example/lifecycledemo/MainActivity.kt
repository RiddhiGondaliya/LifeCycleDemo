package com.example.lifecycledemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate called")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart Called")
        // Timber library avoid all the unnecessary logs
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume Called")

    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy Called")
    }


}





