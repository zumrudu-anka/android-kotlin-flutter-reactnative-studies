package com.zumrudu_anka.storingdata;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = this.getSharedPreferences("com.zumrudu_anka.storingdata", Context.MODE_PRIVATE);

        editText = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView2);

        int storedAge = sharedPreferences.getInt("StoredAge",0);
        if(storedAge!=0){
            textView.setText(""+ storedAge);
        }
    }

    public void SaveText(View view){
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("Are u sure?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            if(!editText.getText().toString().matches("")){
                int userAge = Integer.parseInt(editText.getText().toString());
                textView.setText("" + userAge);
                sharedPreferences.edit().putInt("StoredAge",userAge).apply();
            }
            Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();

            }
        });
        alert.show();

    }

    public void DeleteData(View view){
        int storedData=sharedPreferences.getInt("StoredAge",0);
        if(storedData != 0){
            sharedPreferences.edit().remove("StoredAge").apply();
        }
    }

}
