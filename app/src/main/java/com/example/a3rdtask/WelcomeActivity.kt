package com.example.a3rdtask

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    companion object {
        fun start(context: Context, username: String) {
            val intent = Intent(context, WelcomeActivity::class.java).apply {
                putExtra("username", username)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val username = intent.getStringExtra("username")
        val welcomeText: TextView = findViewById(R.id.welcome_text)
        welcomeText.text = "Welcome, $username!"

        val logoutButton: Button = findViewById(R.id.logout)
        logoutButton.setOnClickListener {
            finish()
        }
    }
}
