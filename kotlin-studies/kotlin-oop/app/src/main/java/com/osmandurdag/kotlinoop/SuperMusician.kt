package com.osmandurdag.kotlinoop

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {

    fun sing(){
        println("Nothing else matters")
    }
}