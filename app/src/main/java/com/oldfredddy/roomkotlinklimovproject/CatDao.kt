package com.oldfredddy.roomkotlinklimovproject

import androidx.room.*


@Dao
interface CatDAO {

    //Добавление кота в базу данных
    @Insert
    fun add(cat: Cat)

    // Добавление котов в базу данных
    @Insert
    fun insertAll(vararg cats: Cat)

    //Меняем кота
    @Update
    fun update(cat: Cat)

    //Удаление кота из базы данных
    @Delete
    fun delete(cat: Cat)

    //Получение всех котов из базы данных
    @Query("SELECT * FROM cats")
    fun getAllCats(): List<Cat>
}