package com.example.ttpay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AdminHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_home)

        // Implementation of the merchant list when you have a database

        // Button to create a new merchant
        val btnCreateMerchant: View = findViewById(R.id.btn_createMerchant)
        btnCreateMerchant.setOnClickListener {
            // Open a new view for creating a new merchant
            // Add logic for creating a new merchant here if needed
        }

        // Button to log out
        val imgLogout: View = findViewById(R.id.imgView_logout)
        imgLogout.setOnClickListener {
            // Add logic for logging out of the application
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Close the current activity (return to main activity)
        }

        // Button for settings
        val imgSettings: View = findViewById(R.id.imgView_settings)
        imgSettings.setOnClickListener {
            // Open a new view for settings
            // Add logic for displaying settings here if needed
        }
    }
}