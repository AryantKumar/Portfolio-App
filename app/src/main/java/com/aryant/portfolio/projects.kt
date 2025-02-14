package com.aryant.portfolio



import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.aryant.portfolio.databinding.ActivityProjectsBinding

class projects : AppCompatActivity() {

    // View Binding
    private lateinit var binding: ActivityProjectsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityProjectsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up click listeners for project cards
        binding.project1Card.setOnClickListener {
            showProjectDetails("SrifMusic", "SrifMusic is an Android app designed to offer a seamless music experience by integrating YouTube for backend streaming and Musixmatch for real-time lyrics.")
        }

        binding.project2Card.setOnClickListener {
            showProjectDetails("Learnify", "Learnify is an Android app that helps users learn programming languages with interactive lessons and quizzes.")
        }

        binding.project3Card.setOnClickListener {
            showProjectDetails("Srifgem", "Srifgem is an AI-powered debugger app designed for Android Studio and Xcode.")
        }

        binding.project4Card.setOnClickListener {
            showProjectDetails("Personal Portfolio App", "A personal portfolio app showcases an individual's skills, projects, and achievements in a visually engaging way.")
        }

        // Additional setup for animations or other UI elements
        setupAnimations()
    }

    private fun showProjectDetails(title: String, description: String) {
        // Display project details in a dialog or new activity
        // For example, show a Toast or navigate to a details screen
        Toast.makeText(this, "$title: $description", Toast.LENGTH_SHORT).show()
    }

    private fun setupAnimations() {
        // Customize Lottie animations if needed
        binding.headerAnimation.speed = 1.5f // Speed up the header animation

        // Optional: Customize other animations
        binding.project1Animation.speed = 1.2f
        binding.project2Animation.speed = 1.2f
        binding.project3Animation.speed = 1.2f
        binding.project4Animation.speed = 1.2f
    }
}