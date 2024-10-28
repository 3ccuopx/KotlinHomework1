package com.example.firstapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyViewHolder(view:View): RecyclerView.ViewHolder(view) {
    private val text = view.findViewById<TextView>(R.id.text_view_1)
    private val image = view.findViewById<ImageView>(R.id.image_view)
    fun bind(number: Int){
        text.text = "$number"
        if (number % 2 == 0)
            image.setBackgroundResource(R.color.red)
        else
            image.setBackgroundResource(R.color.blue)
    }
}