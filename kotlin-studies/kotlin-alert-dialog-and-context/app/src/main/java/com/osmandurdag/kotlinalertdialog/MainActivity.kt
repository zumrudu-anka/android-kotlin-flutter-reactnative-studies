package com.osmandurdag.kotlinalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.osmandurdag.kotlinalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Toast.makeText(applicationContext, "Welcome", Toast.LENGTH_LONG).show()
//        Toast.makeText(this@MainActivity, "Welcome", Toast.LENGTH_LONG).show()

        // Context

        // Activity Context -> this
        // App Context -> applicationContext

//        binding.button.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                Toast.makeText(this@MainActivity, "test2", Toast.LENGTH_LONG).show()
//            }
//        })
    }

    fun save(view : View){
        // Buraya this yerine application context veremiyoruz.
        // Cunku alertdialog activity context bekliyor
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure?")
        alert.setPositiveButton("Yes") {dialog, which ->
            Toast.makeText(applicationContext, "Saved", Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") {dialog, which ->
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}