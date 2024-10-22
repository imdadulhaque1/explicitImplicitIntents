package com.example.firstassignmengt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class CafeOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cafe_order)

        val backToCafeMainActivity = findViewById<Button>(R.id.backToCafeMainActivity)

        backToCafeMainActivity.setOnClickListener{
            // Back To Cafe Main Activity Layout
            val intent = Intent(applicationContext, CafeMainActivity::class.java)
            startActivity(intent)
        }

    }





}