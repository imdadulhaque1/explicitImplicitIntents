package com.example.firstassignmengt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CafeMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cafe_main)

        val backToMainActivity = findViewById<Button>(R.id.backToMainActivity)

        backToMainActivity.setOnClickListener{
            // Back To Main Activity Layout
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

    }
}