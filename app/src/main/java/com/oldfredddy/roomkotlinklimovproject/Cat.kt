package com.oldfredddy.roomkotlinklimovproject

import androidx.room.*


@Entity(tableName = "cats")
data class Cat(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,

    var name: String,

    @ColumnInfo(name = "age")
    val age: Int,

    val breed: String
)

