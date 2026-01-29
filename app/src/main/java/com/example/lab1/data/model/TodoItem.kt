package com.example.lab1.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("my_todo_list")
data class TodoItem(
    @PrimaryKey(true)
    var itemId: Long=0L,

    @ColumnInfo(name="item_name")
    val itemName: String,

    @ColumnInfo(name = "is_completed")
    var isDone: Boolean=false
)