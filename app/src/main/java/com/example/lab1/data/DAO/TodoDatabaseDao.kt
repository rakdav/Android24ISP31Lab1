package com.example.lab1.data.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.lab1.data.model.TodoItem

@Dao
interface TodoDatabaseDao {
    @Query("select * from my_todo_list")
    fun getAll(): LiveData<List<TodoItem>>

    @Query("select * from my_todo_list where itemId=:id")
    fun getById(id: Int): TodoItem?

    @Insert
    suspend fun insert(item: TodoItem)

    @Update
    suspend fun update(item: TodoItem)

    @Delete
    suspend fun delete(item: TodoItem)

    @Query("delete from my_todo_list")
    suspend fun deleteTodos()
}