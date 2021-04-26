package com.example.myapplication.activity

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.ItemsHttpAdapter
import com.example.myapplication.data.repository.ItemsHttpRepository

class ItemsHttpActivity: AppCompatActivity() {
    private var mItems: ArrayList<String> = ArrayList()
    private lateinit var adapter: ItemsHttpAdapter

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_http)

        adapter = ItemsHttpAdapter()
        initItemsHttpRecyclerView()
    }

    private fun initItemsHttpRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.items_list_http)
        recyclerView.adapter = adapter

        val repo = ItemsHttpRepository()
        val items = repo.getItemsCodenames()

        mItems.clear()
        mItems.addAll(items)

        adapter.swapData(mItems)
    }

//    private fun initRecipesRecyclerShared(items : List<Item>){
//
//
////        if (mItems.isEmpty()) {
////            findViewById<TextView>(R.id.no_recipes_found).visibility = View.VISIBLE
////        } else {
////            findViewById<TextView>(R.id.no_recipes_found).visibility = View.GONE
////        }
//    }

}