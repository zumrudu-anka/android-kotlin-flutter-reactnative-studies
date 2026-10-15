package com.osmandurdag.functionsandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()

        // Void = Unit
        mySum(3, 5) // Unit = Void

        // region Return
        val result = myMultiply(4, 14)
        val myTextView = findViewById<TextView>(R.id.myTextView)
        myTextView.text = "${result}"
        // endregion Return

        // region Button Click Listener
        // val myButton = findViewById<Button>(R.id.button)
        // myButton.setOnClickListener {
        //     println("Abi")
        // }
        // endregion Button Click Listener

        // region Classes
            // region Object & Instance
                val homer = Simpson()
                homer.age = 50
                homer.name = "Homer Simpson"
                homer.setJob("Nuclear")

                println(homer.getJob())

                val homer2 = Simpson(32, "Osman", "Computer")
                homer2.name = "Baskasi"
                println(homer2.name)
            // endregion Object & Instance
        // endregion

        // region Nullability
            // !!(kesinlikle degeri var, null degil durumunu garanti ediyorum gibi) vs ? (null olabilir)
            // !!(bunun null olma durumunu programci olarak kabul ediyoruz ve programa sen de kabul et diyoruz)
            var myString : String? = null
            var myAge : Int? = null
            println(myAge)

            //println(myAge * 30) // Its a mistake because myAge is null

//            myAge = 30
//            println(myAge * 30)

            println(myAge!! * 30) // !! -> it's a swear for the myAge value

            // Secure Versions
            // 1) Null safety
            if(myAge != null){
                println("myAge")
            }
            else{
                println("myAge = null")
            }

            // 2) safe call
            println(myAge?.compareTo(2))

            // 3) elvis operator -> ?: -> Null ise bu operatorden sonraki degeri verir
            val myResult = myAge?.compareTo(2) ?: -100
            println(myResult)
        // endregion
    }

    fun test(){
        println("test function")
    }

    // region Input & Return
    fun mySum(a: Int, b: Int){
        val myTextView = findViewById<TextView>(R.id.myTextView)
        myTextView.text = "${a + b}"
    }
    //endregion Input & Return

    fun myMultiply(x: Int, y: Int) : Int{
        return x * y
    }

    fun helloKotlin(view: View){
        println("Hello Kotlin")
    }
}