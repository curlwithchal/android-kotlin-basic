package com.example.basic.intentservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyServiceApplication: Service(){

    private val TAG = "My Service"

    init {
        Log.d(TAG,"Service is Running")
    }
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val dataString  = intent?.getStringExtra("EXTRACT_SERVICE")
        dataString?.let {
            Log.d(TAG, dataString)
        }
        return START_STICKY
    }

}