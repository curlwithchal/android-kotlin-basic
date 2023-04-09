package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver._Parcel
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        setupDialog()
    }

    private fun setupDialog() {
        val btnDialog = findViewById<Button>(R.id.btn_dialog)
        val btnDialogSingleChoice = findViewById<Button>(R.id.btn_single_choice)
        val btnDialogMultipleChoice = findViewById<Button>(R.id.btn_multiple_choice)

        val dialog = AlertDialog.Builder(this)
            .setTitle("Dialog")
            .setIcon(R.drawable.ic_action_person)
            .setMessage("Apakah ingin mendaftarkan seseorang bermana Ichal is list ?")
            .setPositiveButton("No"){_,_ ->
                Toast.makeText(this,"ok anda tidak mendaftarkan dia", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Yes"){_,_ ->
                Toast.makeText(this,"ok anda mendaftarkan dia", Toast.LENGTH_SHORT).show()
            }
            .create()

        val person = arrayOf("Faisal", "Ichal", "Taliki")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Dialog Single Choice")
            .setSingleChoiceItems(person,0){_, i ->
                Toast.makeText(this,"list ${person[i]} ", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){_,_ ->
                Toast.makeText(this,"ok anda menambahkan", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_,_ ->
                Toast.makeText(this,"No, anda membatalkan untuk menambahkan", Toast.LENGTH_SHORT).show()
            }
            .create()

        val multipleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Dialog Multiple Choice")
            .setMultiChoiceItems(person, booleanArrayOf(false,false,false)){_,i,isChecked ->
                if(isChecked){
                     Toast.makeText(this,"you checked person ${person[i]}", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"you unchecked person ${person[i]}", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept"){_,_ ->
                Toast.makeText(this,"you accecpt multiple choice", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){_,_ ->
                Toast.makeText(this,"You declince multiple choice", Toast.LENGTH_SHORT).show()
            }
            .create()

        btnDialog.setOnClickListener {
            dialog.show()
        }
        btnDialogSingleChoice.setOnClickListener {
            singleChoiceDialog.show()
        }

        btnDialogMultipleChoice.setOnClickListener {
            multipleChoiceDialog.show()
        }
    }

}