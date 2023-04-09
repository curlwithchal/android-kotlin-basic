package com.example.basic.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.basic.R

class ViewPagerAdapter(
    private val imagesList: List<Int>
): RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
    inner class ViewPagerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_images_view_pager,parent,false)
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curlImage = imagesList[position]
        holder.itemView.findViewById<ImageView>(R.id.ivImage).setImageResource(curlImage)
    }
}