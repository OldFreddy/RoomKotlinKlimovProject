package com.oldfredddy.roomkotlinklimovproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oldfredddy.roomkotlinklimovproject.MyApp.Companion.database
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            database?.getCatDAO()?.add(Cat(0, "Барсик", 7, "Рэгдолл"))
            database?.getCatDAO()?.add(Cat(0, "Васька", 5, "Мейнкун"))
            database?.getCatDAO()?.add(Cat(0, "Мурзик", 2, "Бирма"))

            // получим список всех котов в базе
            val cats: List<Cat> = database?.getCatDAO()?.getAllCats()!!

            // выводим имя кота с индексом 1
            textView.text = cats[1].name
        }
    }
}