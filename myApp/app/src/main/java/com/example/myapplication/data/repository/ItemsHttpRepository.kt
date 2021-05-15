package com.example.myapplication.data.repository

import com.example.myapplication.data.model.Item
import com.example.myapplication.utils.Constants
import com.example.myapplication.utils.getPlaceholderItems
import kentico.kontent.delivery.ContentItemsListingResponse
import kentico.kontent.delivery.DeliveryClient

/**
 * Repository class for connection to the HTTP part of the Delivery API
 */
class ItemsHttpRepository {
    private val deliveryClient = DeliveryClient(Constants.PROD_PROJECT_ID)

    /**
     * Gets response model with items from Kentico Kontent Delivery API
     * @return response model containing items
     */
    fun getItemsListingResponse(): ContentItemsListingResponse? {
        return deliveryClient
                .items
                .toCompletableFuture()
                .get()
    }

    /**
     * Gets items from listing from response model
     * @return list of items
     */
    fun getItemsForListing(): MutableList<Item> {
        val list = mutableListOf<Item>()
        val items = getItemsListingResponse()
        items?.items?.forEach{
            val item = Item(name = it.system.name, codename = it.system.codename)
            list.add(item)
        }
        if (items?.items.isNullOrEmpty()) {
            return getPlaceholderItems()
        }
        return list
    }
}