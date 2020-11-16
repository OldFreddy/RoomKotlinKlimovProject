package com.oldfredddy.roomkotlinklimovproject

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(Cat::class), version = 1)
abstract class CatDatabase : RoomDatabase(){
    abstract fun getCatDAO(): CatDAO
}