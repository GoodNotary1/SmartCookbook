package com.example.smartcookbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.text)
        text.setOnClickListener() {
            openSecondAcivity()
        }
    }

    private fun openSecondAcivity() {
        val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
    }
}

