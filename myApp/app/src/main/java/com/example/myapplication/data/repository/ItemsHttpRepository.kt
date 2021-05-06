package com.example.myapplication.data.repository

import com.example.myapplication.data.model.Item
import com.example.myapplication.utils.Constants
import com.example.myapplication.utils.getPlaceholderItems
import kentico.kontent.delivery.ContentItemsListingResponse
import kentico.kontent.delivery.DeliveryClient

class ItemsHttpRepository {
    private val deliveryClient = DeliveryClient(Constants.PROJECT_ID)

    fun getItemsListingResponse(): ContentItemsListingResponse? {
        return deliveryClient
                .items
                .toCompletableFuture()
                .get()
    }

    fun getItemsCodenames(): MutableList<String> {
        val names = mutableListOf<String>()
        val items = getItemsListingResponse()
        items?.items?.forEach{
            names.add(it.system.codename)
        }
        if (items?.items.isNullOrEmpty()) {
            return mutableListOf("aaa", "bbb", "cccc")
        }
        return names
    }

    fun getItemsForListing(): MutableList<Item> {
        val list = mutableListOf<Item>()
        val items = getItemsListingResponse()
        items?.items?.forEach{
            val item = Item(name = it.system.name, id = it.system.codename)
            list.add(item)
        }
        if (items?.items.isNullOrEmpty()) {
            return getPlaceholderItems()
        }
        return list
    }
}