package com.example.basic

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts

class ImplicitIntentActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implisit_intent)

        val btnTakePhoto = findViewById<Button>(R.id.btn_takePhoto)

        btnTakePhoto.setOnClickListener {
            starResult.launch(Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
            })
        }


    }

    private val starResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            val uri = result.data?.data
            val imageView = findViewById<ImageView>(R.id.iv_content)
            imageView.setImageURI(uri)
        }
    }

}