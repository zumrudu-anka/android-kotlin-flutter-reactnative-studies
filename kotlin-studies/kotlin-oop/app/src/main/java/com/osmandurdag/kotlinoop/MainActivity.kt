package com.osmandurdag.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.osmandurdag.kotlinoop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var myUser = User()
        myUser.age = 25
        myUser.name = "James"

        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())

        var myUser2 = User("Osman", 32)
        println(myUser2.name)
        println(myUser2.age.toString())

        var james = Musician("James", "Guitar", 55)
        println(james.age.toString())

        println(james.returnBandName("Osman"))
        println(james.returnBandName("Deneme"))

        // inheritance
        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        println(lars.returnBandName("Osman"))
        lars.sing()

        // polymorphism

        // static polymorphism
            var mathematics = Mathematics()
            println(mathematics.sum())
            println(mathematics.sum(3, 4))
            println(mathematics.sum(3, 4, 5))

        // dynamic polymorphism
            var animal = Animal()
            animal.sing()

            var barley = Dog()
            barley.test()
            barley.sing()

        // abstract & interface
        // NOTE yalnizca bir siniftan miras alinabilir fakat birden cok interface implement edilebilir
        // NOTE interface ler %100 abstract tır

            var myPiano = Piano()
            myPiano.brand = "Yamaha"
            myPiano.digital = false
            println(myPiano.roomName)
            myPiano.info()

    }
}