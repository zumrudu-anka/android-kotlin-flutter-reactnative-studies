package com.zumrudu_anka.workonmanyscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String userName;
    EditText editText;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        userName="";
        textView4 = findViewById(R.id.textView4);
        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView4.setText("" + (millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"Done!",Toast.LENGTH_LONG).show();
                textView4.setText("Finish");

            }
        }.start();
    }

    public void changeSecond(View view){
        userName=editText.getText().toString();

        Intent intent=new Intent(MainActivity.this,Main2Activity.class);

        intent.putExtra("userInput",userName);

        startActivity(intent);

    }
}
