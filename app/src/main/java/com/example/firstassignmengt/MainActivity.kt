package com.example.firstassignmengt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val navigate2ndScreen = findViewById<Button>(R.id.navigateSecondScreen)
        val navigateToCafeHouse = findViewById<Button>(R.id.navigateCafeHouseScreen)

        navigate2ndScreen.setOnClickListener{
            // Navigate to Second Screen
            val intent=Intent(applicationContext, TechnologyListScreen::class.java)
            startActivity(intent)

        }

        navigateToCafeHouse.setOnClickListener{
            // Navigate To Cafe House Screen
            val intent = Intent(applicationContext, CafeMainActivity::class.java)
            startActivity(intent)
        }
    }
}