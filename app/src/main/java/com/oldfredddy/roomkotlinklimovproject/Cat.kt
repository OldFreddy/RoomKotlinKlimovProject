package com.oldfredddy.roomkotlinklimovproject

import androidx.room.*


@Entity(tableName = "cats")

data class Cat(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,

    val name: String,

    @ColumnInfo(name = "age")
    val age: Int,

    val breed: String,

    @Ignore
    val gender: String



)

