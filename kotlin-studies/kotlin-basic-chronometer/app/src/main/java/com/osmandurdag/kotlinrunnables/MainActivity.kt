package com.osmandurdag.kotlinrunnables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.osmandurdag.kotlinrunnables.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var number : Int = 0
    var runnable : Runnable = Runnable {}
    var handler : Handler = Handler()

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun start(view: View){
//        Thread.sleep(1000)

        runnable = object : Runnable{
            override fun run() {
                number = number + 1
                binding.textView.text = "Time: $number"
                handler.postDelayed(this, 1000)
            }
        }

        handler.post(runnable)
    }

    fun stop(view: View){
        handler.removeCallbacks(runnable)
        number = 0
        binding.textView.text = "Time: 0"
    }
}