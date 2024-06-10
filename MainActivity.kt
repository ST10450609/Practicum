package com.example.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNext=findViewById<Button>(R.id.btnNext)
        val btnExit=findViewById<Button>(R.id.btnExit)

        btnNext?.setOnClickListener {
            val intent= Intent(this,MainScreen::class.java)
              startActivity(intent)
        }



        }



        }



