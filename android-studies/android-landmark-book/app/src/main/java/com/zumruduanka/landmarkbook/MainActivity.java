package com.zumruduanka.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.zumruduanka.landmarkbook.DesignPatterns.Singleton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

//    static Bitmap selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<LandmarkItem> landMarks = new ArrayList<>();
        landMarks.add(new LandmarkItem(
                "Pisa",
                "Italy",
                BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.pisa)
        ));
        landMarks.add(new LandmarkItem(
                "Eiffel",
                "France",
                BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.eiffel)
        ));
        landMarks.add(new LandmarkItem(
                "Collesseum",
                "Italy",
                BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.colosseum)
        ));
        landMarks.add(new LandmarkItem(
                "London Bridge",
                "United Kingdom",
                BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.londonbridge)
        ));
        landMarks.add(new LandmarkItem(
                "Taj Mahal",
                "India",
                BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.tajmahal)
        ));
        landMarks.add(new LandmarkItem(
                "Kremlin",
                "Russia",
                BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.kremlin)
        ));

        ArrayList<String> landmarkNames = new ArrayList<>();

        for(int index = 0; index < landMarks.size(); index++){
            landmarkNames.add(landMarks.get(index).getName());
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.list_item_white_text, R.id.list_content, landmarkNames);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((adapterView, view, index, l) -> {
            Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
            detailIntent.putExtra("name", landMarks.get(index).getName());
            detailIntent.putExtra("country", landMarks.get(index).getCountry());
//            selectedImage = landmarkImages.get(index);

            Singleton singleton = Singleton.getInstance();
            singleton.setChosenImage(landMarks.get(index).getImage());

            startActivity(detailIntent);
        });

    }
}