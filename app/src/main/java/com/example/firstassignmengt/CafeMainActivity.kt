package com.example.firstassignmengt

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.firstassignmengt.databinding.ActivityCafeMainBinding

class CafeMainActivity : AppCompatActivity() {

    // Declare a variable for ViewBinding
    private lateinit var binding: ActivityCafeMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewBinding
        binding = ActivityCafeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        // Use ViewBinding to access the Button
        binding.backToMainActivity.setOnClickListener {
            // Back To Main Activity Layout
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        binding.orderNowId.setOnClickListener{
            Toast.makeText(applicationContext, "Cafe Ordering...", Toast.LENGTH_SHORT).show()
        }

    }
}
