package com.amrabdelhamiddiab.forgroundserviceme

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import androidx.core.content.ContextCompat

class ForegroundService : Service() {
    private val CHANNEL_ID = "ForegroundService Kotlin"

    companion object {
        fun startService(context: Context, message: String) {
            val startIntent = Intent(context, ForegroundService::class.java)
            startIntent.putExtra("inputExtra", message)
            ContextCompat.startForegroundService(context, startIntent)

        }

        fun stopService(context: Context) {
            val stopIntent = Intent(context, ForegroundService::class.java)
            context.startService(stopIntent)

        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int){

    }
    override fun onBind(p0: Intent?): IBinder? {

    }
}