package com.test.testapp2394108;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText tx1, tx2;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tx1 = findViewById(R.id.editText1);
        tx2 = findViewById(R.id.editText2);
        b1 = findViewById(R.id.but1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello bt1: " + tx1.getText().toString() + " Hellotx2: " + tx2.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });


    }
}