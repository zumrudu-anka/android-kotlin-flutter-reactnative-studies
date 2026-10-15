package com.zumrudu_anka.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //static Bitmap selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);

        final ArrayList<String> landmarknames=new ArrayList<>();
        landmarknames.add("Colosseum");
        landmarknames.add("Eiffel");
        landmarknames.add("Kremlin");
        landmarknames.add("London Bridge");
        landmarknames.add("Pisa");
        landmarknames.add("Taj Mahal");

        final ArrayList<Bitmap> landmarkImages=new ArrayList<>();
        Bitmap colosseum= BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.colosseum);
        Bitmap eiffel=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffel);
        Bitmap kremlin=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kremlin);
        Bitmap london_bridge=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londonbridge);
        Bitmap pisa=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pisa);
        Bitmap taj_mahal=BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.tajmahal);

        landmarkImages.add(colosseum);
        landmarkImages.add(eiffel);
        landmarkImages.add(kremlin);
        landmarkImages.add(london_bridge);
        landmarkImages.add(pisa);
        landmarkImages.add(taj_mahal);


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,landmarknames){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                View view=super.getView(position,convertView,parent);
                TextView textView=view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.rgb(20,100,120));
                textView.setTextSize(19);
                textView.setTypeface(null, Typeface.BOLD_ITALIC);

                return view;
            }
        };

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("name",landmarknames.get(position));
                //selectedImage=landmarkImages.get(position);

                Bitmap bitmap=landmarkImages.get(position);
                Globals globals=Globals.getInstance();
                globals.setChosenimage(bitmap);
                startActivity(intent);
            }
        });



    }
}
