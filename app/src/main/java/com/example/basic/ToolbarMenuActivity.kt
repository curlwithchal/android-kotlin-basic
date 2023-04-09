package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ToolbarMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.im_setting -> Toast.makeText(this, "Click setting", Toast.LENGTH_SHORT).show()
            R.id.im_favorite-> Toast.makeText(this, "Click Favorite", Toast.LENGTH_SHORT).show()
            R.id.im_contact-> Toast.makeText(this, "Click Contact", Toast.LENGTH_SHORT).show()
            R.id.im_feddback-> Toast.makeText(this, "Thanks Feedback", Toast.LENGTH_SHORT).show()
            R.id.im_close -> finish()
        }
        return true
    }
}