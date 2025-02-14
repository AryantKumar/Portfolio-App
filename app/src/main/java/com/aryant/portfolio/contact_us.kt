package com.aryant.portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aryant.portfolio.databinding.ActivityContactUsBinding

class contact_us : AppCompatActivity() {

    private lateinit var binding: ActivityContactUsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityContactUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up email validation animation
        setupEmailValidation()

        // Set up send button with loading animation
        setupSendButton()

        // Set up social media buttons
        setupSocialMediaButtons()
    }

    private fun setupEmailValidation() {
        binding.emailInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val email = s.toString()
                if (isValidEmail(email)) {
                    // Show validation animation if email is valid
                    binding.emailValidationAnimation.visibility = View.VISIBLE
                    binding.emailValidationAnimation.playAnimation()

                    // Show a Toast message indicating the email is valid
                    Toast.makeText(this@contact_us, "Email is valid", Toast.LENGTH_SHORT).show()
                } else {
                    // Hide validation animation if email is invalid
                    binding.emailValidationAnimation.visibility = View.GONE

                    // Show a Toast message if the email is not valid and the field is not empty
                    if (email.isNotEmpty()) {
                        Toast.makeText(this@contact_us, "Email is not valid", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        })
    }

    private fun setupSendButton() {
        binding.sendButton.setOnClickListener {
            val name = binding.nameInput.text.toString().trim()
            val email = binding.emailInput.text.toString().trim()
            val work = binding.workInput.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || work.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!isValidEmail(email)) {
                Toast.makeText(this, "Invalid email address", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Show loading animation
            binding.sendButton.text = ""
            binding.sendingAnimation.visibility = View.VISIBLE
            binding.sendingAnimation.playAnimation()

            // Simulate sending message
            Handler(Looper.getMainLooper()).postDelayed({
                binding.sendingAnimation.visibility = View.GONE
                binding.sendButton.text = "Message Sent!"

                // Open email client with pre-filled details
                sendEmail(name, email, work)
            }, 2000) // Simulate a 2-second delay
        }
    }

    private fun sendEmail(name: String, email: String, work: String) {
        // Construct the email body
        val emailBody = """
        Work you need: $work
    """.trimIndent()

        // Create the email intent
        val emailIntent = Intent(Intent.ACTION_SEND).apply {
            type = "message/rfc822" // MIME type for email
            putExtra(Intent.EXTRA_EMAIL, arrayOf("mynamearyant34@gmail.com")) // Recipient email
            putExtra(Intent.EXTRA_SUBJECT, "Work Inquiry from $name") // Email subject
            putExtra(Intent.EXTRA_TEXT, emailBody) // Email body
        }

        try {
            // Check if there's an app that can handle the email intent
            if (emailIntent.resolveActivity(packageManager) != null) {
                startActivity(Intent.createChooser(emailIntent, "Send email using...")) // Open email app chooser
                Toast.makeText(this, "Opening email app...", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "No email app found", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Error sending email: ${e.message}", Toast.LENGTH_LONG).show()
        }
    }


    private fun setupSocialMediaButtons() {
        binding.linkedinButton.setOnClickListener {
            openLinkedInProfile()
        }

        binding.twitterButton.setOnClickListener {
            openTwitterProfile()
        }
    }

    private fun openLinkedInProfile() {
        val linkedInUrl = "https://www.linkedin.com/in/aryant-kumar-dev" // Replace with your LinkedIn profile URL
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(linkedInUrl))
        startActivity(intent)
    }

    private fun openTwitterProfile() {
        val twitterUrl = "https://x.com/kumar_aryant" // Replace with your Twitter profile URL
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(twitterUrl))
        startActivity(intent)
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}