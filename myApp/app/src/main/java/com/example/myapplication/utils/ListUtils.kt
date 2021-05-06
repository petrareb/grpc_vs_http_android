package com.example.myapplication.utils

import com.example.myapplication.data.model.Item

fun getPlaceholderItems(): MutableList<Item> {
    val list = mutableListOf<Item>()

    list.add(Item("aaa", "id_aaa"))
    list.add(Item("bbb", "id_bbb"))
    list.add(Item("ccc", "id_ccc"))
    return list
}
