package com.amrabdelhamiddiab.forgroundserviceme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttonStart : Button
    private lateinit var buttonStop : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonStart = findViewById(R.id.buttonStart)
        buttonStop = findViewById(R.id.buttonStop)
        buttonStart.setOnClickListener {
            ForegroundService.startService(this, "Foreground Service is running...")
        }
        buttonStop.setOnClickListener {
            ForegroundService.stopService(this)
        }

    }
}