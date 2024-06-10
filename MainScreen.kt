package com.example.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        fun main() {
            val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
            val temperatures = DoubleArray(7)

            println("Enter the temperatures for the week:")

            for (i in daysOfWeek.indices) {
                print("Temperature for ${daysOfWeek[i]}: ")
                temperatures[i] = readLine()?.toDoubleOrNull() ?: 0.0
            }

            val averageTemperature = temperatures.average()

            println("The average temperature for the week is %.2f".format(averageTemperature))
        }

        val btnNext = findViewById<Button>(R.id.btnneXt)
        val btnExit = findViewById<Button>(R.id.btneXit)

        btnNext?.setOnClickListener {
            val intent = Intent(this, LastPage::class.java)
            startActivity(intent)

        }

    }
}
