package com.example.myapplication.adapter

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.model.Item

class ItemsGrpcAdapter(
        private var items: List<Item> = listOf()
) : RecyclerView.Adapter<ItemsGrpcAdapter.ViewHolder>() {

    class ViewHolder(
            private var itemsView: View
    ) : RecyclerView.ViewHolder(itemsView) {

        var itemName: TextView = itemsView.findViewById(R.id.item_name)
        var itemId: TextView = itemsView.findViewById(R.id.item_id)

        @SuppressLint("UseCompatLoadingForDrawables")
        fun bind(item: Item) {
            itemName.text = item.name
            itemId.text = item.id
            val img: Drawable = itemsView.resources.getDrawable(R.drawable.ic_circle)
            img.setBounds(0, 0, 60, 60)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.items_list_item,
                        parent,
                        false
                )
        )
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun swapData(newData: List<Item>) {
        items = newData
        notifyDataSetChanged()
    }
}