package com.zumrudu_anka.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView=findViewById(R.id.imageView);
        TextView textView=findViewById(R.id.textView);

        Intent intent=getIntent();

        String name=intent.getStringExtra("name");

        textView.setText(name);

        //imageView.setImageBitmap(MainActivity.selectedImage);

        Globals globals=Globals.getInstance();
        Bitmap bitmap=globals.getChosenimage();

        imageView.setImageBitmap(bitmap);

    }
}
