package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val name = findViewById<EditText>(R.id.edt_name)
        val age = findViewById<EditText>(R.id.edtAge)
        val country = findViewById<EditText>(R.id.edtCountry)
        val btnApply = findViewById<Button>(R.id.apply)
/*
        val edtName = name.text.toString()
        val edtAge = age.text.toString().toInt()
        val edtCountry= country.text.toString()
//        val person = Person(edtName,edtAge,edtCountry)*/

        btnApply.setOnClickListener {
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name.text.toString())
                it.putExtra("EXTRA_AGE", age.text.toString().toInt())
                it.putExtra("EXTRA_COUNTRY", country.text.toString())
//                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
        }
    }
}