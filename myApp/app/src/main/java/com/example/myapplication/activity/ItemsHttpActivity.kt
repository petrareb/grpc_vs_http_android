package com.example.myapplication.activity

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.ItemsHttpAdapter
import com.example.myapplication.data.model.Item
import com.example.myapplication.data.repository.ItemsHttpRepository
import com.example.myapplication.utils.Constants

/**
 * Activity displaying items retrieved from HTTP Delivery API
 */
class ItemsHttpActivity : AppCompatActivity() {
    private var mItems: ArrayList<Item> = ArrayList()
    private lateinit var adapter: ItemsHttpAdapter
    private var useLocalhost: Boolean = false

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items_http)

        useLocalhost = intent.getBooleanExtra(Constants.LOCALHOST, false)

        adapter = ItemsHttpAdapter()

        initItemsHttpRecyclerView()
    }

    private fun initItemsHttpRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.items_list_http)

        val dividerItemDecoration = DividerItemDecoration(
                recyclerView.context,
                DividerItemDecoration.HORIZONTAL)
        recyclerView.addItemDecoration(dividerItemDecoration)

        recyclerView.adapter = adapter

        val repo = ItemsHttpRepository()
        val items = repo.getItemsForListing()

        mItems.clear()
        mItems.addAll(items)

        adapter.swapData(mItems)
    }
}