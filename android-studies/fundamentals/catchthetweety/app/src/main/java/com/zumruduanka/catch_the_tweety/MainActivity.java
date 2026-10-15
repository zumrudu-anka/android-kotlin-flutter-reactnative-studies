package com.zumruduanka.catch_the_tweety;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView time, score;
    int currentTime = 10;
    int currentScore = 0;

    ArrayList<ImageView> tweetyList;
    int imageCount;
    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = findViewById(R.id.timeText);
        time.setText(String.format(getString(R.string.time), currentTime));
        score = findViewById(R.id.scoreText);
        score.setText(String.format(getString(R.string.score), currentScore));

        new CountDownTimer(currentTime * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time.setText(String.format(getString(R.string.time), millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                time.setText(R.string.time_off);
                handler.removeCallbacks(runnable);
                for(ImageView tweety : tweetyList){
                    tweety.setVisibility(View.INVISIBLE);
                }

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Restart?");
                alert.setMessage("Are you sure to restart game?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast = Toast.makeText(MainActivity.this, "Game Over!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                alert.show();
            }
        }.start();

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        imageCount = gridLayout.getChildCount();
        tweetyList = new ArrayList<>();

        for(int i = 0; i < imageCount; i++){
            ImageView imageView = (ImageView) gridLayout.getChildAt(i);
            imageView.setOnClickListener(imView -> {
                currentScore++;
                score.setText(String.format(getString(R.string.score), currentScore));
            });
            tweetyList.add(imageView);
        }

        hideImages();

    }

    public void hideImages(){
        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                for(ImageView tweety : tweetyList){
                    tweety.setVisibility(View.INVISIBLE);
                }
                Random random = new Random();
                int i = random.nextInt(imageCount);
                tweetyList.get(i).setVisibility(View.VISIBLE);

                handler.postDelayed(this, 300);

            }
        };

        handler.post(runnable);
    }
}