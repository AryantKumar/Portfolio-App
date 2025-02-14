package com.aryant.portfolio


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aryant.portfolio.databinding.ActivityProfileBinding

class profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up view binding
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handle edge-to-edge layout
        ViewCompat.setOnApplyWindowInsetsListener(binding.profileImage) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // You can perform other logic here such as setting up click listeners or data binding
    }
}
