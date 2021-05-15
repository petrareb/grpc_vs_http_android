package com.example.myapplication.data.repository

import com.example.myapplication.data.model.Item
import com.example.myapplication.utils.Constants
import com.example.myapplication.utils.getPlaceholderItems
import kentico.kontent.delivery.ContentItemsListingResponse
import kentico.kontent.delivery.DeliveryClient
import kentico.kontent.delivery.DeliveryOptions

/**
 * Repository class for connection by localhost to the HTTP part of the Delivery API
 */
class ItemsHttpLocalhostRepository {
    private var deliveryOptions: DeliveryOptions = DeliveryOptions()
    private var deliveryClient: DeliveryClient

    init {
        deliveryOptions.productionEndpoint = Constants.HTTP_LOCALHOST_EMULATOR //"https://qa-deliver.global.ssl.fastly.net"// //"http://127.0.0.1:19710"
        deliveryOptions.projectId = Constants.LOCAL_HTTP_PROJECT_ID
        deliveryClient = DeliveryClient(deliveryOptions)
//        deliveryClient = DeliveryClient(
//            DeliveryOptions
//                .builder()
//                .projectId("faa3cb57-7b91-0128-87ca-b4647da33b36")
//                .productionEndpoint("http://10.0.2.2:19710")
//                .build()
//        );
    }

    /**
     * Gets response model with items from Kentico Kontent Delivery API
     * @return response model containing items
     */
    fun getItemsListingResponse(): ContentItemsListingResponse? {
        val response: ContentItemsListingResponse
        try {
            response = deliveryClient
                .items
                .toCompletableFuture()
                .get()
        } catch (e: Exception) {
            return null
        }
        return response
    }

    /**
     * Gets items from listing from response model
     * @return list of items
     */
    fun getItemsForListing(): MutableList<Item> {
        val list = mutableListOf<Item>()
        val items = getItemsListingResponse()
        items?.items?.forEach{
            val item = Item(name = it.system.name, codename = it.system.id)
            list.add(item)
        }
        if (items?.items.isNullOrEmpty()) {
            return getPlaceholderItems()
        }
        return list
    }
}
