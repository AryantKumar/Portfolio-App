package com.aryant.portfolio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aryant.portfolio.databinding.ActivityViewMyPhotosBinding
import com.bumptech.glide.Glide
import android.content.Intent
import android.net.Uri

class view_my_photos : AppCompatActivity() {

    // Declare view binding
    private lateinit var binding: ActivityViewMyPhotosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize view binding
        binding = ActivityViewMyPhotosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener for the animatedButton
        binding.animatedButton.setOnClickListener {
            openInstagramProfile("https://www.instagram.com/raw.aryant/")
        }

        // Load images into all 10 ImageViews
        loadImages()
    }

    /**
     * Opens the Instagram profile in the browser or Instagram app.
     *
     * @param profileUrl The URL of the Instagram profile.
     */
    private fun openInstagramProfile(profileUrl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(profileUrl))
        startActivity(intent)
    }

    /**
     * Loads images into all 10 ImageViews using Glide (from local drawables).
     */
    private fun loadImages() {
        // List of drawable resource IDs
        val imageResources = listOf(
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.photo3,
            R.drawable.photo4,
            R.drawable.photo5,
            R.drawable.photo6,
            R.drawable.photo7,
            R.drawable.photo8,
            R.drawable.photo9,
            R.drawable.photo10
        )

        // List of ImageViews
        val imageViews = listOf(
            binding.photo1,
            binding.photo2,
            binding.photo3,
            binding.photo4,
            binding.photo5,
            binding.photo6,
            binding.photo7,
            binding.photo8,
            binding.photo9,
            binding.photo10
        )

        // Load images into ImageViews using Glide
        for (i in imageViews.indices) {
            Glide.with(this)
                .load(imageResources[i]) // Load from drawable
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(imageViews[i])
        }
    }
}
