package com.osmandurdag.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Comment Line

        // System.out
        println("Hello World")

        // Variables
        var x = 5
        var y = 4
        println(x * y)

        var age = 35
        println(age / 7 * 5)

        age = 36
        println(age / 6)

        // Constants
        val z = 5
        println(z)

        // z = 7 -> you cant change the value because value is same as constant

        // Defining
        val myInteger : Int

        // Initialize
        myInteger = 25
        println(myInteger)

        val myInteger2 : Int = 5
        println(myInteger2)

        // val name2 : Int = "Abi" -> You cant do this because name2 is defined with Int type

        // Double & Float
        val pi = 3.14 // double
        println(pi * 2)

        val myFloat = 3.14f // float
        println(myFloat * 2)

        var myAge : Double = 32.0

        var yourAge : Float = 27.0f

        var myByte : Byte = 127

        var myLong : Long = 24352435235

        var myShort : Short = 12334

        // Strings
        println("String")

        val myString : String = "Osman DURDAG"
        val name = "osman"
        val surname = "DURDAG"
        val fullName = name + " " + surname
        println(fullName)

        println(fullName.capitalize())

        // Boolean
        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        println(6 < 5)
        println(3 == 3)
        println(4 != 5 && 3 < 13)

        // Type Conversions
        var myNumber = 5
        myNumber.toByte()

        var myNumber2 : Byte = 12
        myNumber2.toLong()

        var myNumber3 : Short = 5
        myNumber3.toFloat()

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger)

        // region Collections

            // Arrays
            val myArray = arrayOf("James", "Kirk", "Rob", "Lars")
            println(myArray[0])
            myArray[0] = "James Hetfield"
            println(myArray[0])
            println(myArray) // -> it will be show register address

            myArray.set(1, "Kirk Hammett")
            println(myArray.get(1))

            // myArray[4] = "Osman DURDAG" -> you cant increase array size after the array defining
            // println(myArray[4])

            val numberArray = arrayOf(1, 2, 3, 4, 5)
            println(numberArray[3])

            val myNewArray = doubleArrayOf(1.0, 2.3, 4.5)
            val mixedArray = arrayOf("Osman", 32, "Durdag")
            println(mixedArray[0])
            println(mixedArray[1])

            // Lists
            val myMusician = arrayListOf<String>("Osman", "Durdag")
            println(myMusician[0])

            myMusician.add("Lars")

            val myMusician2 = ArrayList<String>()
            myMusician2.add("Durdag")
            myMusician2.add(0, "Osman")
            println(myMusician2[0])
            println(myMusician2[1])

            val myIntArrayList = ArrayList<Int>()
            myIntArrayList.add(4)
            myIntArrayList.add(100)

            val myMixedArrayList = ArrayList<Any>()
            myMixedArrayList.add("Osman")
            myMixedArrayList.add(32)
            myMixedArrayList.add("Erzurum")
            myMixedArrayList.add(85.5)

            // Set
            val myExampleArray = arrayOf(1, 1, 2, 3, 4)
            println("first element: ${myExampleArray[0]}")
            println("second element: ${myExampleArray[1]}")

            val mySet = setOf<Int>(1, 1, 2, 3)
            println(mySet.size)

            mySet.forEach { println(it) } // lambda expression. // it = keyword = each element in the foreach
            mySet.forEach { println(it * 3) }
            mySet.forEach { element -> println(element * 3) }
            mySet.forEach { element -> (println(element * 5))}

            val myStringSet = HashSet<String>()
            myStringSet.add("Osman")
            myStringSet.add("Osman")
            myStringSet.add("osman")
            myStringSet.add("Durdag")
            myStringSet.add("Durdag")
            println(myStringSet.size)

            // Map - HashMap -> Key-Value Pair
            val fruitArray = arrayOf("Apple", "Banana")
            val caloriesArray = arrayOf(100, 150)

            println("${fruitArray[0]} : ${caloriesArray[0]}")
            println("${fruitArray[1]} : ${caloriesArray[1]}")

            val fruitCaloriesMap = hashMapOf<String, Int>()
            fruitCaloriesMap["Apple"] = 100
            fruitCaloriesMap["Banana"] = 150
            println(fruitCaloriesMap["Apple"])

            val myHashMap = HashMap<String, String>()

            val myNewMap = hashMapOf<String, Int>("A" to 1, "B" to 2, "C" to 3, "E" to 5, "Z" to 29)
            println(myNewMap["Z"])
        // endregion Collections

        // region Operators
            var m = 5
            m = m + 1
            m++
            println(m)
            m--
            println(m)
            var n = 7
            println(n > m)

            println(n > m && 1 > 2)
            println(n > m || 1 > 2)

            println(11 % 3)
        // endregion Operators

        // region If Control
            val myNumberAge = 32

            if (myNumberAge < 30) {
                println("< 30")
            } else if (myNumberAge >= 30 && myNumberAge < 40){
                println("30 - 40")
            } else if (myNumberAge >= 40 && myNumberAge < 50) {
                println("40 - 50")
            } else {
                println(">= 50")
            }

        // endregion If Control

        // region switch - when
            val day = 3
            var dayString = ""

            when(day){
                1 -> dayString = "Monday"
                2 -> dayString = "Tuesday"
                3 -> dayString = "Wednesday"
                else -> dayString = ""
            }

            println(dayString)

        // endregion switch - when

        // region Loops
            // region For Loop
                val myArrayOfNumbers = arrayOf(12, 15, 18, 21, 24, 27, 30, 33)

                for(number in myArrayOfNumbers){
                    val z = number / 3 * 5
                    println(z)
                }

                for(i in myArrayOfNumbers.indices) {
                    val qz = myArrayOfNumbers[i] / 3 * 5
                    println(qz)
                }

                for(b in 0..9){
                    println(b)
                }

                val myStringArrayList = ArrayList<String>()
                myStringArrayList.add("Osman")
                myStringArrayList.add("Durdag")
                myStringArrayList.add("Erzurum")

                for (str in myStringArrayList){
                    println(str)
                }

                myStringArrayList.forEach { println(it) }
            // endregion For Loop

            // region While Loop

                var j = 0
                while (j < 10){
                    println(j)
                    j = j + 1
                }

            // endregion While Loop
        // endregion Loops
    }
}