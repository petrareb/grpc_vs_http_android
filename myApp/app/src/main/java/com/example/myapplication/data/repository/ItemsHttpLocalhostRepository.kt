package com.example.myapplication.data.repository

import com.example.myapplication.utils.Constants
import kentico.kontent.delivery.ContentItemsListingResponse
import kentico.kontent.delivery.DeliveryClient
import kentico.kontent.delivery.DeliveryOptions

class ItemsHttpLocalhostRepository {
//    private val client = OkHttpClient()

//    fun getItemsListingResponse(): ContentItemsListingResponse? {
//        val api = getHttpUrl(Constants.ITEMS_HTTP_ENDPOINT)
//    }

    private val deliveryClient = DeliveryClient(
            DeliveryOptions
                    .builder()
                    .projectId(Constants.PROJECT_ID)
                    .productionEndpoint(getHttpUrl())
                    .build()
            );

    fun getItemsListingResponse(): ContentItemsListingResponse? {
        var endpoint = deliveryClient.items.toCompletableFuture()
        var result = endpoint.get()
        return result
//        return deliveryClient
//                .items
//                .toCompletableFuture()
//                .get()
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
