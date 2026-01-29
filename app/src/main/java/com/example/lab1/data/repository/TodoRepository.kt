package com.example.lab1.data.repository

import androidx.lifecycle.LiveData
import com.example.lab1.data.DAO.TodoDatabaseDao
import com.example.lab1.data.model.TodoItem

class TodoRepository(private val todoDatabaseDao: TodoDatabaseDao) {
    val readAllDate: LiveData<List<TodoItem>> = todoDatabaseDao.getAll()
    suspend fun addTodo(todoItem: TodoItem){
        todoDatabaseDao.insert(todoItem)
    }
    suspend fun updateTodo(todoItem: TodoItem){
        todoDatabaseDao.update(todoItem)
    }
    suspend fun deleteTodo(todoItem: TodoItem){
        todoDatabaseDao.delete(todoItem)
    }
    suspend fun deleteAllTodos(){
        todoDatabaseDao.deleteTodos()
    }
}