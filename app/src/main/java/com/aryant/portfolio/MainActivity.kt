package com.aryant.portfolio



import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aryant.portfolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up button listeners for navigation
        binding.aboutMeButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        binding.projectsButton.setOnClickListener {
            val intent = Intent(this, projects::class.java)
            startActivity(intent)
        }
        binding.contactButton.setOnClickListener {
            val intent = Intent(this, contact_us::class.java)
            startActivity(intent)
        }
        binding.photographyButton.setOnClickListener {
            val intent = Intent(this, view_my_photos::class.java)
            startActivity(intent)
        }

    }
}
