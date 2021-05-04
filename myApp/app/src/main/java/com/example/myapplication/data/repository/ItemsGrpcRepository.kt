package com.example.myapplication.data.repository

import com.example.myapplication.data.generated.*
import com.example.myapplication.utils.Constants
import io.grpc.ManagedChannelBuilder
import io.grpc.StatusRuntimeException

class ItemsGrpcRepository {
    private val channel = ManagedChannelBuilder
//        .forAddress(Constants.LOCALHOST, Constants.PORT_NUMBER_GRPC)
//        .forAddress(Constants.IP, 5001)
//        .forAddress("10.0.2.2", 5001) // https://grpc.io/docs/platforms/android/java/quickstart/ returns unavailable exp
        .forTarget("10.0.2.2:5000") // https://developer.android.com/studio/run/emulator-networking#networkaddresses
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

    fun getItemsCodenames(): MutableList<String> {
        val names = mutableListOf<String>()
        val items = getItems(Constants.PROJECT_ID)
        items?.itemsList?.forEach {
            names.add(it.system.codename)
        }

        if (items?.itemsList.isNullOrEmpty()) {
            return mutableListOf("aaa", "bbb", "cccc")
        }
        return names
    }

    fun getItemsCodenamesMocked(): MutableList<String> {
        return mutableListOf("aaa", "bbb", "cccc")
    }


}