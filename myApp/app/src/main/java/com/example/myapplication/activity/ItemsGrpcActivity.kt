package com.example.myapplication.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.ItemsGrpcAdapter
import com.example.myapplication.data.model.Item
import com.example.myapplication.data.repository.ItemsGrpcRepository

class ItemsGrpcActivity: AppCompatActivity() {
    private var mItems: ArrayList<Item> = ArrayList()
    private lateinit var adapter: ItemsGrpcAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_grpc)

        adapter = ItemsGrpcAdapter()
        initItemsGrpcRecyclerView()
    }

    private fun initItemsGrpcRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.items_list_grpc)
        recyclerView.adapter = adapter

        val repo = ItemsGrpcRepository()
        val items = repo.getItemsForListing()

        mItems.clear()
        mItems.addAll(items)

        adapter.swapData(mItems)

//        if (mItems.isEmpty()) {
//            findViewById<TextView>(R.id.no_items_found_http).visibility = View.VISIBLE
//        } else {
//            findViewById<TextView>(R.id.no_items_found_http).visibility = View.GONE
//        }
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