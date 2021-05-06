package com.example.myapplication.data.repository

import com.example.myapplication.data.generated.*
import com.example.myapplication.data.model.Item
import com.example.myapplication.utils.Constants
import com.example.myapplication.utils.getPlaceholderItems
import io.grpc.ManagedChannelBuilder
import io.grpc.StatusRuntimeException

class ItemsGrpcRepository {
    private val channel = ManagedChannelBuilder
// https://grpc.io/docs/platforms/android/java/quickstart/ returns unavailable exp
            .forTarget(Constants.GRPC_LOCALHOST_EMULATOR) // https://developer.android.com/studio/run/emulator-networking#networkaddresses
            .usePlaintext()
            .build()
    private val itemsStub = ItemsServiceGrpc.newBlockingStub(channel);

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

    fun getItem(projectId: String, codeName: String): ItemModelContainer.ItemModel? {
        val request = ItemsServiceContainer.ItemsServiceRequest
                .newBuilder()
                .setProjectId(projectId)
                .setCodename(codeName)
                .build()
        val response: ResponseModelContainer.ResponseModel
        try {
            response = itemsStub.getItem(request)
        } catch (e: StatusRuntimeException) {
            return null
        }
        return response.content.itemModel
    }

    fun getItemsForListing(): MutableList<Item> {
        val items = mutableListOf<Item>()
        val response = getItems(Constants.PROJECT_ID)
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