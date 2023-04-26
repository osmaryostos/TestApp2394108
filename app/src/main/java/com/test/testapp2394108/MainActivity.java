package com.test.testapp2394108;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int resultA = 0, resultB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button teamA3, teamA2, teamA1, teamB3, teamB2, teamB1, result, reset;
        EditText editTeamA, editTeamB;

        teamA3 = findViewById(R.id.button);
        teamA2 = findViewById(R.id.button3);
        teamA1 = findViewById(R.id.button4);
        teamB3 = findViewById(R.id.button6);
        teamB2 = findViewById(R.id.button8);
        teamB1 = findViewById(R.id.button10);
        result = findViewById(R.id.button11);
        reset = findViewById(R.id.button12);
        editTeamA = findViewById(R.id.editTextTextPersonName);
        editTeamB = findViewById(R.id.editTextTextPersonName2);

        teamA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultA += 3;
                editTeamA.setText(String.valueOf(resultA));
            }
        });

        teamA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultA += 2;
                editTeamA.setText(String.valueOf(resultA));
            }
        });

        teamA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultA ++;
                editTeamA.setText(String.valueOf(resultA));
            }
        });

        teamB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultB += 3;
                editTeamB.setText(String.valueOf(resultB));
            }
        });

        teamB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultB += 2;
                editTeamB.setText(String.valueOf(resultB));
            }
        });

        teamB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultB ++;
                editTeamB.setText(String.valueOf(resultB));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               resultB = resultA = 0;
                editTeamB.setText(String.valueOf(resultB));
                editTeamA.setText(String.valueOf(resultA));
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String team;
                if(resultA > resultB){
                    team = " TEAM A!";
                } else if (resultA < resultB) {
                    team = " TEAM B!";
                }else{
                    team = " NONE =(";
                }
                Toast.makeText(MainActivity.this, "Winner is:... " + team, Toast.LENGTH_LONG).show();
            }
        });
    }






}