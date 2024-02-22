package com.example.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var ViewAdapter : RecyclerView.Adapter<*>
private lateinit var ViewManager : RecyclerView.LayoutManager
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        var listArray = listOf("Soto", "Bebek")

        ViewManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL ,false)
        ViewAdapter = ListAdapter(listArray)

        recyclerView.layoutManager = ViewManager
        recyclerView.adapter = ViewAdapter
    }
}