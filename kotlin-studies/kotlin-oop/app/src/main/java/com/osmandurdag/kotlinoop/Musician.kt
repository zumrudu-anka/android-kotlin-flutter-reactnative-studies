package com.osmandurdag.kotlinoop

// NOTE Siniflar kotlinde default olarak final olarak olusturulur.
// NOTE Baska bir sinifin bu siniftan miras alabilmesi icin open anahtar kelimesini ekledik

open class Musician(name: String, instrument: String, age: Int) {

    var name : String? = name
        private set
        get

    private var instrument : String? = instrument

    var age : Int? = age
        get
        private set

    private val bandName : String = "Metallica"

    fun returnBandName(password : String) : String{
        if(password == "Osman"){
            return bandName
        }
        return "Wrong Password!"
    }
}