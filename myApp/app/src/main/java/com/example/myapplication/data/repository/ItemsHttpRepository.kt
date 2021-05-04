package com.example.myapplication.data.repository

import com.example.myapplication.utils.Constants
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
}