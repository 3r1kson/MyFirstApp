package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textTitle = findViewById<TextView>(R.id.textView)
        val btnClickMe = findViewById<Button>(R.id.myButton)

        var timesClicked = 0

        btnClickMe.setOnClickListener {
            timesClicked += 1
            textTitle.text = timesClicked.toString()
            Toast.makeText(this, "Hey I'' a toast", Toast.LENGTH_LONG).show()
        }
    }
}