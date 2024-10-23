package com.example.firstassignmengt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.firstassignmengt.databinding.ActivityCafeMainBinding


class CafeOrderActivity : AppCompatActivity() {
    // Declare a variable for ViewBinding
    private lateinit var binding: ActivityCafeMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cafe_order)

        val orderListViewId = findViewById<TextView>(R.id.orderListViewId)
        val backToCafeMainActivity = findViewById<Button>(R.id.backToCafeMainActivity)

        val customerOrders = intent.getStringExtra(CafeMainActivity.KEY)
        orderListViewId.text = customerOrders.toString()

        backToCafeMainActivity.setOnClickListener{
            // Back To Cafe Main Activity Layout
            val intent = Intent(applicationContext, CafeMainActivity::class.java)
            startActivity(intent)
        }



    }





}