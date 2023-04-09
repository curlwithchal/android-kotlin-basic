package com.example.basic

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi

class SecondActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvPerson = findViewById<TextView>(R.id.tv_person)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val stringPerson = "my name is : $name \n my age is : $age \n is country : $country"
//        val person = intent.getSerializableExtra("EXTRA_PERSON",Person::class.java) as Person
        tvPerson.text = stringPerson

    }
}