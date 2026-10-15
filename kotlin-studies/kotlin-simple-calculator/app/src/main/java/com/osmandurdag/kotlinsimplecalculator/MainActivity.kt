package com.osmandurdag.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.osmandurdag.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun getNumbersCheckAndOperate(operationType: String){
        val number1 = binding.editTextNumber.text.toString().toIntOrNull()
        val number2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if(number1 == null || number2 == null){
            binding.resultText.text = "Error!"
        }
        else {
            val result : Int = when(operationType){
                "summation" -> number1 + number2
                "substraction" -> number1 - number2
                "multiplication" -> number1 * number2
                "division" -> number1 / number2
                else -> 0
            }
            binding.resultText.text = result.toString()

        }
    }

    fun summation(view: View){
        getNumbersCheckAndOperate("summation")
    }

    fun substraction(view: View){
        getNumbersCheckAndOperate("substraction")
    }

    fun multiplication(view: View){
        getNumbersCheckAndOperate("multiplication")
    }

    fun division(view: View){
        getNumbersCheckAndOperate("division")
    }
}