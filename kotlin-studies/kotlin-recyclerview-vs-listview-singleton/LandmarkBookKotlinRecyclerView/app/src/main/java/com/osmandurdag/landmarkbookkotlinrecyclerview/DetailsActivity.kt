package com.osmandurdag.landmarkbookkotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.osmandurdag.landmarkbookkotlinrecyclerview.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        // casting
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        // NOTE
        //  eger singleton yapisi kullanilarak veri aktarilmak istenmisse, aktarilan veri asagidaki gibi elde edilebilir
        //  val selectedLandmark = MySingleton.chosenLandmark

        binding.nameText.text = selectedLandmark.name
        binding.countryText.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)
    }
}