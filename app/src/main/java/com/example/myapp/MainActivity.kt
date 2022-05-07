package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            Log.i("ACTIVITY 1", "Click on button 6");
            //val intent = Intent(this, )
        }
        val button20 = findViewById<Button>(R.id.button20)
        button20.setOnClickListener {
            Log.i("ACTIVITY 1", "Click on button 20");
        }
    }
}