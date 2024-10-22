package com.example.firstassignmengt

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstassignmengt.TechList

class TechnologyListScreen : AppCompatActivity() {
    private lateinit var techListRecyclerView: RecyclerView
    private lateinit var techListAdapter: TechListAdapter
    private val phoneNumber = "01770019346"
    private val REQUEST_CALL_PERMISSION = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_technology_list_screen)

        techListRecyclerView = findViewById(R.id.tech_list_recycler)
        techListRecyclerView.layoutManager = LinearLayoutManager(this)

        val android_id = findViewById<CardView>(R.id.android_id)
        val ios_id = findViewById<CardView>(R.id.ios_id)
        val web_id = findViewById<CardView>(R.id.web_id)
        val ml_id = findViewById<CardView>(R.id.ml_id)
        val dl_id = findViewById<CardView>(R.id.dl_id)
        val nlp_id = findViewById<CardView>(R.id.nlp_id)
        val rl_id = findViewById<CardView>(R.id.rl_id)
        val tl_id = findViewById<CardView>(R.id.tl_id)
        val gan_id = findViewById<CardView>(R.id.gan_id)
        val crossPlatform_id = findViewById<CardView>(R.id.crossPlatform_id)
        val fastApi_id = findViewById<CardView>(R.id.fastApi_id)
        val db_id = findViewById<CardView>(R.id.db_id)

        val phoneCallButton: Button = findViewById<Button>(R.id.phoneCall_id)
        phoneCallButton.setOnClickListener {
            makePhoneCall()
        }

        // Sample data
        val androidTechList = listOf(
            TechList(id = 1, name = "Kotlin"),
            TechList(id = 2, name = "Java"),
            TechList(id = 3, name = "C++")
        )
        val iosTechList = listOf(
            TechList(id = 1, name = "Swift"),
            TechList(id = 2, name = "Objective-C"),
            TechList(id = 3, name = "C#")
        )
        val webTechList = listOf(
            TechList(id = 1, name = "ReactJS"),
            TechList(id = 2, name = "NextJS"),
            TechList(id = 3, name = "VueJS")
        )
        val mlTechList = listOf(
            TechList(id = 1, name = "Python"),
            TechList(id = 2, name = "JavaScript"),
            TechList(id = 3, name = "Java")
        )
        val dlTechList = listOf(
            TechList(id = 1, name = "CNN"),
            TechList(id = 2, name = "ANN"),
            TechList(id = 3, name = "Deep CNN")
        )
        val nlpTechList = listOf(
            TechList(id = 1, name = "Tokenization"),
            TechList(id = 2, name = "Stemming and Lemmatization"),
            TechList(id = 3, name = "POS Tagging")
        )
        val rlTechList= listOf(
            TechList(id=1, name="Q-Learning"),
            TechList(id=2, name="Deep Q-Networks"),
            TechList(id=3, name="SARSA (State-Action-Reward-State-Action)"),
            TechList(id=3, name="Double Q-Learning"),
            TechList(id=3, name="Policy Gradient Methods"),
            TechList(id=3, name="Asynchronous Advantage Actor-Critic (A3C)"),
            TechList(id=3, name="Prioritized Experience Replay"),
            TechList(id=3, name="Cross-Entropy Method (CEM)"),
        )
        val tlTechList= listOf(
            TechList(id=1, name="Fine-tuning"),
            TechList(id=2, name="Feature Extraction"),
            TechList(id=3, name="Domain-Adversarial Training"),
            TechList(id=3, name="Transductive Transfer Learning"),
            TechList(id=3, name="Inductive Transfer Learning"),
            TechList(id=3, name="Zero-Shot Learning (ZSL)"),
            TechList(id=3, name="Few-Shot Learning (FSL)"),
            TechList(id=3, name="Model-Agnostic Meta-Learning (MAML)"),
            TechList(id=3, name="Progressive Neural Networks"),
        )
        val ganTechList= listOf(
            TechList(id=1, name="Deep Convolutional GAN (DCGAN)"),
            TechList(id=2, name="Least Squares GAN (LSGAN)"),
            TechList(id=3, name="Auxiliary Classifier GAN (ACGAN)"),
            TechList(id=3, name="Conditional GAN (cGAN)"),
            TechList(id=3, name="Wasserstein GAN (WGAN)"),
            TechList(id=3, name="Progressive GAN (PGAN)"),
            TechList(id=3, name="Self-Attention GAN (SAGAN)"),
            TechList(id=3, name="Super-Resolution GAN (SRGAN)"),
        )
        val crossPlatformTechList= listOf(
            TechList(id=1, name="React Native"),
            TechList(id=2, name="Flutter"),
            TechList(id=3, name="ionic"),
        )
        val fastApiTechList= listOf(
            TechList(id=1, name="Hashing algorithms "),
            TechList(id=2, name="JSON Web Token (JWT) authentication"),
            TechList(id=3, name="OAuth2.0 authorization"),
            TechList(id=3, name="Rate-limiting algorithms"),
            TechList(id=3, name="Sorting and filtering algorithms"),
            TechList(id=3, name="Search algorithms"),
            TechList(id=3, name="Throttling algorithms"),
            TechList(id=3, name="Data validation algorithms"),
        )
        val dbTechList= listOf(
            TechList(id=1, name="MongoDB"),
            TechList(id=2, name="MySQL"),
            TechList(id=3, name="PostgreSQL"),
            TechList(id=3, name="SQLite"),
            TechList(id=3, name="Oracle"),
            TechList(id=3, name="Microsoft SQL Server"),
            TechList(id=3, name="Redis"),
            TechList(id=3, name="MariaDB"),
        )
        // Click listeners for each category
        android_id.setOnClickListener {
            displayTechList(androidTechList)
        }
        ios_id.setOnClickListener {
            displayTechList(iosTechList)
        }
        web_id.setOnClickListener {
            displayTechList(webTechList)
        }
        ml_id.setOnClickListener {
            displayTechList(mlTechList)
        }
        dl_id.setOnClickListener {
            displayTechList(dlTechList)
        }
        nlp_id.setOnClickListener {
            displayTechList(nlpTechList)
        }
        rl_id.setOnClickListener {
            displayTechList(rlTechList)
        }
        tl_id.setOnClickListener {
            displayTechList(tlTechList)
        }
        gan_id.setOnClickListener {
            displayTechList(ganTechList)
        }
        crossPlatform_id.setOnClickListener {
            displayTechList(crossPlatformTechList)
        }
        fastApi_id.setOnClickListener {
            displayTechList(fastApiTechList)
        }
        db_id.setOnClickListener {
            displayTechList(dbTechList)
        }
    }


    private fun makePhoneCall() {
        // Check if CALL_PHONE permission is granted
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // Request the CALL_PHONE permission
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), REQUEST_CALL_PERMISSION)
        } else {
            // Permission granted, make the call
            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse("tel:$phoneNumber")
            startActivity(callIntent)
        }
    }

    // Handle the permission request result
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CALL_PERMISSION) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, make the call
                makePhoneCall()
            } else {
                // Permission denied, handle appropriately
            }
        }
    }

    private fun displayTechList(techList: List<TechList>) {
        techListAdapter = TechListAdapter(techList)
        techListRecyclerView.adapter = techListAdapter
    }
}
