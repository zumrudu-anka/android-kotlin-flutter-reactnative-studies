package com.osmandurdag.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.osmandurdag.kotlinintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        println("On Create Called")
    }

    override fun onResume() {
        super.onResume()
        println("On Resume Called")
    }

    override fun onPause() {
        super.onPause()
        println("On Pause Called")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy Called")
    }

    fun next(view: View){
        val intent = Intent(applicationContext, NextActivity::class.java)
        intent.putExtra("username", binding.usernameTextView.text.toString())
        intent.putExtra("name", binding.nameTextView.text.toString())
        startActivity(intent)
        finish() // Simdiki aktiviteyi destroy eder. Boylece arka planda calismasini engeller
    }
}