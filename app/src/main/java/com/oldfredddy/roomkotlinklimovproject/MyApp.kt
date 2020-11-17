package com.oldfredddy.roomkotlinklimovproject

import android.app.Application
import androidx.room.Room

class MyApp : Application() {

    companion object {
        var database: CatDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        MyApp.database = Room.databaseBuilder(this, CatDatabase::class.java, "mydatabase")
            .allowMainThreadQueries()
            .build()
    }
}