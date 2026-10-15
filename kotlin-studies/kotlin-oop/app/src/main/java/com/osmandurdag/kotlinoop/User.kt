package com.osmandurdag.kotlinoop

class User : People {

    // properties
    var name : String? = null
    var age : Int? = null

    // constructor vs init

    constructor()

    constructor(name: String, age: Int){
        this.name = name
        this.age = age

        println("User Created")
    }

    init {
        println("init")
    }

}