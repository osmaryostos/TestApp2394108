package com.test.testapp2394108;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    CheckBox ch1,ch2,ch3;
    Button bOrder;
    Boolean pizza, ice, coffe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ch1 = findViewById(R.id.checkBox);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox5);

        bOrder = findViewById(R.id.button5);


        bOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("The order include: ");

                if(ch1.isChecked()){
                    result.append("\nPizza got selected");
                }
                if(ch2.isChecked()){
                    result.append("\nIce Cream got selected");
                }
                if(ch3.isChecked()){
                    result.append("\nCoffe got selected");
                }

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

            }
        });
    }


}