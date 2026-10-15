package com.osmandurdag.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.osmandurdag.kotlinintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Get Intent
        binding.nextActivityUsernameTextView.text = intent.getStringExtra("username")
        binding.nextActivityNameTextView.text = intent.getStringExtra("name")

        println("Next on create called")
    }

    override fun onResume() {
        super.onResume()
        println("Next on Resume called")
    }

    override fun onPause() {
        super.onPause()
        println("Next on Pause called")
    }

    override fun onStop() {
        super.onStop()
        println("Next on Stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Next on Destroy called")
    }
}