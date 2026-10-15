package com.osmandurdag.storingdata

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.osmandurdag.storingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // NOTE Shared Preferences
        // Shared Preferences Initialize
        // MODE_PRIVATE -> Olusturulan dosya yalnizca kendi uygulamasinin icerisinden cagrilabiliyor
        // Hangi shared preferences'i cagiracagimizi ilk parametre olarak giriyoruz.
        // Genel kullanimda asagidaki gibi projenin adi kullaniliyor
        sharedPreferences = this.getSharedPreferences("com.osmandurdag.storingdata", MODE_PRIVATE)

        val ageFromPreferences = sharedPreferences.getInt("Age", -1)
        if(ageFromPreferences == -1){
            binding.textView.text = "Your Age: "
        }
        else{
            binding.textView.text = "Your Age: $ageFromPreferences"
        }
    }

    fun save(view: View){
        var age = binding.editTextAge.text.toString().toIntOrNull()
        if (age != null){
            binding.textView.text = "Your Age: $age"
        }
        else{
            age = 0
        }

        // Save data to shared Preferences
        sharedPreferences.edit().putInt("Age", age).apply()
    }

    fun delete(view: View){
        val ageFromPreferences = sharedPreferences.getInt("Age", -1)
        if(ageFromPreferences != -1){
            sharedPreferences.edit().remove("Age").apply()
            binding.textView.text = "Your Age: "
        }
    }
}