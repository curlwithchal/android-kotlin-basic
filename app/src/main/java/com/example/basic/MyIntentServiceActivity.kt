package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.basic.intentservice.MyServiceApplication

class MyIntentServiceActivity : AppCompatActivity() {
    
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_intent_service)

        val btnStart = findViewById<Button>(R.id.btn_startService)
        val btnStop = findViewById<Button>(R.id.btn_StopService)
        val btnSendata = findViewById<Button>(R.id.btn_sendData)
        val tvServiceTextRunning = findViewById<TextView>(R.id.tv_runningService)
        val edtTextService = findViewById<EditText>(R.id.edtTextService)


        btnStart.setOnClickListener {
            Intent(this, MyServiceApplication::class.java).also {
                startService(it)
                tvServiceTextRunning.text = "Service Running"
            }
        }

        btnStop.setOnClickListener {
            Intent(this, MyServiceApplication::class.java).also {
                stopService(it)
                tvServiceTextRunning.text = "Service Stopped"
            }
        }

        btnSendata.setOnClickListener {
            Intent(this, MyServiceApplication::class.java).also {
                val putDataString = edtTextService.text.toString()
                it.putExtra("EXTRACT_SERVICE", putDataString)
                startService(it)
            }
        }

    }

}