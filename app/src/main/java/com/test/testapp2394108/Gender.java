package com.test.testapp2394108;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Gender extends AppCompatActivity {

     Button b1;
     CheckBox ch1, ch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = findViewById(R.id.button2);
        ch1 = findViewById(R.id.checkBox3);
        ch2 = findViewById(R.id.checkBox4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Gender.this, Login.class));
            }
        });

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.isChecked()){
                    Toast.makeText(getApplicationContext(), "Hello guy! ", Toast.LENGTH_LONG).show();
                }
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch2.isChecked()){
                    Toast.makeText(getApplicationContext(), "Hello girl! ", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}