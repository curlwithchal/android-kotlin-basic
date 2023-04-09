package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class CheckBoxRadioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_radio_button)

        val btnOrder = findViewById<Button>(R.id.btn_order)
        val rgMeat = findViewById<RadioGroup>(R.id.rg_meat)
        val cbWater = findViewById<CheckBox>(R.id.cb_water)
        val cbJuice = findViewById<CheckBox>(R.id.cb_jus)
        val cbNutrisari = findViewById<CheckBox>(R.id.cb_nutrisari)
        val tvOrder = findViewById<TextView>(R.id.tv_order)

        btnOrder.setOnClickListener {
            val checkedMeatRadioButton = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButton)
            val water = cbWater.isChecked
            val juice = cbJuice.isChecked
            val nutrisari = cbNutrisari.isChecked
            val orderString = "Your Order meat wit: \n"+
                    "${meat.text}" +
                    (if(water) "\nWater" else "") +
                    (if(juice) "\nJuice" else "")+
                    (if(nutrisari) "\nNutrisari" else "")
            tvOrder.text = orderString
        }
    }
}