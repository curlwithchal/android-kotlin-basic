package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.get

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val spnCalendar = findViewById<Spinner>(R.id.spn_calendar)

        val fooBar = listOf<String>("Foo", "Bar", "Foo Bar")
        val arrayAdapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,fooBar)

        spnCalendar.adapter = arrayAdapter

        spnCalendar.onItemSelectedListener = object : OnItemSelectedListener{
            override fun onItemSelected(viewAdapter: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@SpinnerActivity, "${viewAdapter?.getItemAtPosition(position)}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }
}