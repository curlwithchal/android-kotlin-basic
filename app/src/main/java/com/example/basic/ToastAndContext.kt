package com.example.basic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class ToastAndContext : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_and_context)

        val btnToast = findViewById<Button>(R.id.btn_toast)
//        val clLayout = findViewById<View>(R.id.cl_toast)

        btnToast.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_layout_toast, findViewById(R.id.cl_toast))
                show()
            }

        }
    }
}