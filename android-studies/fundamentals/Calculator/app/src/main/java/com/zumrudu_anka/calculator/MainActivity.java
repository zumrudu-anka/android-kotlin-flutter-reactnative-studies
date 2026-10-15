package com.zumrudu_anka.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView resulttext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        resulttext=findViewById(R.id.textView);

    }

    public void summing(View view){

        if(editText.getText().toString().matches("" ) || editText2.getText().toString().matches("" )){
            resulttext.setTextColor(Color.RED);
            resulttext.setText("Hatalı Giriş");
        }
        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            resulttext.setText(""+(a+b));
        }
    }

    public void substracting(View view){
        if(editText.getText().toString().matches("" ) || editText2.getText().toString().matches("" )){
            resulttext.setTextColor(Color.RED);
            resulttext.setText("Hatalı Giriş");

        }
        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            resulttext.setText(""+(a-b));
        }
    }

    public void mulling(View view){
        if(editText.getText().toString().matches("" ) || editText2.getText().toString().matches("" )){
            resulttext.setTextColor(Color.RED);
            resulttext.setText("Hatalı Giriş");
        }
        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            resulttext.setText(""+(a*b));
        }
    }

    public void dividing(View view){
        if(editText.getText().toString().matches("" ) || editText2.getText().toString().matches("" )){
            resulttext.setTextColor(Color.RED);
            resulttext.setText("Hatalı Giriş");

        }
        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            resulttext.setText(""+(a/b));
        }
    }
}
