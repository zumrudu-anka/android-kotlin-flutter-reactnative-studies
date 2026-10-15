package com.zumrudu_anka.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Runnable runnable;
    Handler handler;
    Button startbutton,stopbutton;
    int number=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        startbutton=findViewById(R.id.startbutton);
        stopbutton=findViewById(R.id.stopbutton);
    }

    public void startbut(View view){
        number=0;
        stopbutton.setEnabled(true);
        handler=new Handler();
        runnable =new Runnable() {
            @Override
            public void run() {
                textView.setText("" + number);
                number++;
                handler.postDelayed(runnable,1000);
            }
        };

        handler.post(runnable);
        startbutton.setEnabled(false);

    }

    public void stopbut(View view){
        handler.removeCallbacks(runnable);
        stopbutton.setEnabled(false);
        startbutton.setEnabled(true);
    }
}
