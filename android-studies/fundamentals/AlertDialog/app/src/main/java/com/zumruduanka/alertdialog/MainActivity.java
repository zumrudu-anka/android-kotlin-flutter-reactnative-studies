package com.zumruduanka.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();
    }

    public void save(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Save");

        alert.setMessage("Are You Sure?");

        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });

        alert.setNegativeButton("No", (dialog, which) -> {
            Toast.makeText(MainActivity.this, "Not Saved", Toast.LENGTH_SHORT).show();
        });

        alert.show();
    }
}