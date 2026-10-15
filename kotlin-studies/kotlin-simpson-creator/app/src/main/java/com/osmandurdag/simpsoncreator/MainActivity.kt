package com.osmandurdag.simpsoncreator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.osmandurdag.simpsoncreator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun makeSimpson(view: View){
        val name = binding.nameText.text.toString()
        var age = binding.ageText.text.toString().toIntOrNull()
        val job = binding.jobText.text.toString()

        if (age == null){
            age = 0
        }
        val simpson = Simpson(name, age, job)

        binding.resultView.text = "Name: ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"

    }
}