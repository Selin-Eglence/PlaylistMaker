package com.practicum.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

    val arrow = findViewById<Button>(R.id.light_mode)
    arrow.setOnClickListener {
        val intent = Intent(this@SettingsActivity, MainActivity::class.java)
        startActivity(intent)
    }
}}