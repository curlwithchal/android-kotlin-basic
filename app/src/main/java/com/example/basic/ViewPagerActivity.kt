package com.example.basic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver._Parcel
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.basic.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        
        val viewPager = findViewById<ViewPager2>(R.id.vp_images)
        val tabLayout = findViewById<TabLayout>(R.id.tbLayout)

        val images: List<Int> = listOf(
            R.drawable.ichal,
            R.drawable.vagabond
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager){tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}