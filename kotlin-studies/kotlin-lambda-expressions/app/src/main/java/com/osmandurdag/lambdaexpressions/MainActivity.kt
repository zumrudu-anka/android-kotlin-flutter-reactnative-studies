package com.osmandurdag.lambdaexpressions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.osmandurdag.lambdaexpressions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        printString("My Test String")

        val testString = {myString : String -> println(myString)}
        testString("my Lambda String")

        val multiplyLambda = {x : Int, y : Int -> x * y}
        println(multiplyLambda(4, 5))

        val multiplyLambda2 : (Int, Int) -> Int = {x, y -> x * y}
        println(multiplyLambda2(5, 5))

        // asynchronous
        downloadMusicians("metallica.com") {
            println("Completed && ready")
        }

        downloadMusicians2("metallica.com") { musician ->
            println(musician.name)
            println(musician.age)
        }

    }

    fun printString(myString: String){
        println(myString)
    }

    // NOTE Unit burada void gibi. ikinci parametre olarak parametre almayan ve geriye deger dondurmeye bir fonksiyon veriliyor burada
    fun downloadMusicians(url: String, completion : () -> Unit){
        // url -> download
        // data
        completion()
    }

    fun downloadMusicians2(url: String, completion: (Musician) -> Unit){
        var musician = Musician()
        musician.name = "Osman"
        musician.age = 32
        completion(musician)
    }

}