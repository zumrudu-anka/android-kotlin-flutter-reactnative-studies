package com.zumruduanka.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.zumruduanka.landmarkbook.DesignPatterns.Singleton;

//import static com.zumruduanka.landmarkbook.MainActivity.selectedImage;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView landmarkNameTextView = findViewById(R.id.landmarkNameTextView);
        TextView countryNameTextView = findViewById(R.id.countryNameTextView);

        Intent intent = getIntent();
        String landmarkName = intent.getStringExtra("name");
        String countryName = intent.getStringExtra("country");
        landmarkNameTextView.setText(landmarkName);
        countryNameTextView.setText(countryName);

//        imageView.setImageBitmap(selectedImage);

        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());

    }
}