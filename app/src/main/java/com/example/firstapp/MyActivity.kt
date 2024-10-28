package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MyActivity: AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var fab: FloatingActionButton
    private val adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {    // Создать activity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)             // отобразить UI на экране

        recycleView = findViewById(R.id.recycler_view)
        recycleView.adapter = adapter

        fab = findViewById(R.id.fab)

        fab.setOnClickListener{
            adapter.addItems(adapter.itemCount + 1)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("key",adapter.itemCount)
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {

        for (i in 0 until savedInstanceState.getInt("key"))
        {
            adapter.addItems(i+1)
        }
        super.onRestoreInstanceState(savedInstanceState)
    }
}