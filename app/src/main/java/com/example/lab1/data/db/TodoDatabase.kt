package com.example.lab1.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.lab1.data.DAO.TodoDatabaseDao
import com.example.lab1.data.model.TodoItem

@Database(entities = [TodoItem::class], version = 1, exportSchema = false)
abstract class TodoDatabase: RoomDatabase() {
    abstract fun todoDao(): TodoDatabaseDao
    companion object{
        private var INSTANCE: TodoDatabase?=null
        fun getInstance(context: Context): TodoDatabase{
            synchronized(this){
                var instance=INSTANCE
                if(instance==null){
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        TodoDatabase::class.java, "todo_list_db"
                    ).fallbackToDestructiveMigration(false).build()
                    INSTANCE=instance
                }
                return instance
            }
        }
    }
}