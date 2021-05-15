package com.example.myapplication.data.repository

import com.example.myapplication.data.generated.*
import com.example.myapplication.data.model.Item
import com.example.myapplication.utils.Constants
import com.example.myapplication.utils.getPlaceholderItems
import io.grpc.ManagedChannelBuilder
import io.grpc.StatusRuntimeException

/**
 * Repository class for connection by localhost to the gRPC part of the Delivery API
 */
class ItemsGrpcRepository {
    private val channel = ManagedChannelBuilder
            .forTarget(Constants.GRPC_LOCALHOST_EMULATOR)
            .usePlaintext()
            .build()
    private val itemsStub = ItemsServiceGrpc.newBlockingStub(channel);

    /**
     * Gets response model with items from Kentico Kontent gRPC part of Delivery API
     * @return response model containing items
     */
    fun getItems(projectId: String): ItemsModelContainer.ItemsModel? {
        val request = ItemsServiceContainer.ItemsServiceRequest
                .newBuilder()
                .setProjectId(projectId)
                .build()
        val response: ResponseModelContainer.ResponseModel
        try {
            response = itemsStub.getItems(request)
        } catch (e: StatusRuntimeException) {
            return null
        }
        return response.content.itemsModel
    }

    /**
     * Gets items from listing from response model
     * @return list of items
     */
    fun getItemsForListing(): MutableList<Item> {
        val items = mutableListOf<Item>()
        val response = getItems(Constants.LOCAL_GRPC_PROJECT_ID)
        response?.itemsList?.forEach {
            val item = Item(it.system.name, it.system.codename)
            items.add(item)
        }
        if (items.isNullOrEmpty()) {
            return getPlaceholderItems()
        }
        return items
    }
}