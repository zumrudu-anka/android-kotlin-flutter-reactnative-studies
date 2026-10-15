package com.zumrudu_anka.catchthephoenix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    TextView timetext,scoretext;
    int score;
    ImageView[] imageViews;
    Handler handler;
    Runnable runnable;
    Button resbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timetext=findViewById(R.id.timetext);
        scoretext=findViewById(R.id.scoretext);
        score=0;
        resbutton=findViewById(R.id.restartbutton);
        resbutton.setVisibility(View.INVISIBLE);
        imageViews=new ImageView[16];
        imageViews[0]=findViewById(R.id.imageView1);
        imageViews[1]=findViewById(R.id.imageView2);
        imageViews[2]=findViewById(R.id.imageView3);
        imageViews[3]=findViewById(R.id.imageView4);
        imageViews[4]=findViewById(R.id.imageView5);
        imageViews[5]=findViewById(R.id.imageView6);
        imageViews[6]=findViewById(R.id.imageView7);
        imageViews[7]=findViewById(R.id.imageView8);
        imageViews[8]=findViewById(R.id.imageView9);
        imageViews[9]=findViewById(R.id.imageView10);
        imageViews[10]=findViewById(R.id.imageView11);
        imageViews[11]=findViewById(R.id.imageView12);
        imageViews[12]=findViewById(R.id.imageView13);
        imageViews[13]=findViewById(R.id.imageView14);
        imageViews[14]=findViewById(R.id.imageView15);
        imageViews[15]=findViewById(R.id.imageView16);

        hideImages();

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timetext.setText("Time: " + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                timetext.setText("Time Over");
                handler.removeCallbacks(runnable);
                for (ImageView image : imageViews){
                    image.setVisibility(View.INVISIBLE);
                }
                resbutton.setVisibility(View.VISIBLE);
            }
        }.start();

    }

    public void increaseScore(View view){
        scoretext.setText("Score: " + ++score);
    }

    public void hideImages(){
        handler=new Handler();

        runnable=new Runnable() {
            @Override
            public void run() {
                for (ImageView image : imageViews){
                    image.setVisibility(View.INVISIBLE);
                }
                Random random=new Random();
                int i=random.nextInt(16);
                imageViews[i].setVisibility(View.VISIBLE);

                handler.postDelayed(this,500);
            }
        };

        handler.post(runnable);

    }

    public void restartGame(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Restart Game");
        alert.setMessage("Are u Sure?");

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"OK",Toast.LENGTH_SHORT).show();
            }
        });

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=getIntent();
                finish();
                startActivity(intent);
            }
        });

        alert.show();
    }

}
