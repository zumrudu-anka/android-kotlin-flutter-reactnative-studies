package com.osmandurdag.kotlinsqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val myDatabase = this.openOrCreateDatabase("Musicians", MODE_PRIVATE, null)
            // NOTE CREATE TABLE
            // myDatabase.execSQL("CREATE TABLE IF NOT EXISTS musicians (name VARCHAR, age INT)")
            myDatabase.execSQL("CREATE TABLE IF NOT EXISTS musicians (id INTEGER PRIMARY KEY, name VARCHAR, age INT)")
            // NOTE INSERT
            // myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('James', 50)")
            // myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Lars', 60)")
            // myDatabase.execSQL("INSERT INTO musicians (name, age) VALUES ('Kirk', 55)")

            // NOTE UPDATE
//            myDatabase.execSQL("UPDATE musicians SET age = 61 WHERE name = 'Lars'")
//            myDatabase.execSQL("UPDATE musicians SET name = 'Kirk Hammet' WHERE id = 3")

            // NOTE DELETE
            myDatabase.execSQL("DELETE FROM musicians WHERE id = 4")

            // NOTE ikinci parametre, filtreleme yapmak istiyor muyuz diye soruyor
//            val cursor = myDatabase.rawQuery("SELECT * FROM musicians WHERE name LIKE 'K%'", null)
//            val cursor = myDatabase.rawQuery("SELECT * FROM musicians WHERE name LIKE '%s'", null)
            val cursor = myDatabase.rawQuery("SELECT * FROM musicians", null)
            val nameIndex = cursor.getColumnIndex("name")
            val ageIndex = cursor.getColumnIndex("age")
            val idIndex = cursor.getColumnIndex("id")

            while (cursor.moveToNext()){
                val name = cursor.getString(nameIndex)
                val age = cursor.getInt(ageIndex)
                val id = cursor.getInt(idIndex)
                println("Name: $name")
                println("Age: $age")
                println("Id: $id")
            }

            cursor.close()

        } catch (e: Exception){
            e.printStackTrace()
        }
    }
}