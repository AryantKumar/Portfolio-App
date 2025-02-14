package com.aryant.portfolio


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Set a delay to show the splash screen for a few seconds before moving to the MainActivity
        Handler().postDelayed({
            // After the delay, start the MainActivity
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Close the SplashActivity
        }, 3000) // Splash screen will show for 3 seconds
    }
}
