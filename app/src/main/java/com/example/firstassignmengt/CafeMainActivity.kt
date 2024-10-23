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

    // Create global Key
    companion object{
        const val KEY = "com.example.firstassignmengt.CafeMainActivity.KEY"
    }

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
            val createOrder = binding.order1Id.text.toString() + " " + binding.order2Id.text.toString() + " " +
                    binding.order3Id.text.toString() + " " + binding.order4Id.text.toString()

            intent = Intent(this, CafeOrderActivity::class.java)
            intent.putExtra(KEY, createOrder)
            startActivity(intent)

            Toast.makeText(applicationContext, "Cafe Ordering...", Toast.LENGTH_SHORT).show()
        }

    }
}
