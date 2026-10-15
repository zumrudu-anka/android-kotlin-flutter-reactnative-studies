package com.osmandurdag.kotlinoop

class Piano : HouseDecor, Instrument {

    var brand : String? = null
    var digital : Boolean? = null

    override var roomName: String
        get() = "Kitchen"
        set(value) {}

    override fun info2() {
        println("info 2")
    }

}