package com.example.myapplication.utils

import com.example.myapplication.data.model.Item

/**
 * @return a list of placeholder items
 */
fun getPlaceholderItems(): MutableList<Item> {
    val list = mutableListOf<Item>()

    list.add(Item("Content item 1", "content_item_1"))
    list.add(Item("Content item 2", "content_item_2"))
    list.add(Item("Content item 3", "content_item_3"))
    list.add(Item("Content item 4", "content_item_4"))
    list.add(Item("Content item 5", "content_item_5"))
    list.add(Item("Content item 6", "content_item_6"))
    list.add(Item("Content item 7", "content_item_7"))
    list.add(Item("Content item 8", "content_item_8"))
    list.add(Item("Content item 9", "content_item_9"))
    return list
}
