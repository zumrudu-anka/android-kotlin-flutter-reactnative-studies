package com.osmandurdag.kotlinoop

interface Instrument {

    fun info(){
        // NOTE javada fonksiyon govdesini yazamiyorduk
        println("instrument info")
    }

    // NOTE bu sekilde fonksiyonun govdesini bos da birakabiliriz. Fakat bu durumda
    // NOTE implement eden sinifta bu fonksiyonun govdesini tanimlamamiz gerekir
    fun info2()
}