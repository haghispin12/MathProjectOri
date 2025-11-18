package com.example.mathporjectori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        private Excallback excallback;
    private  Exercise e1;
    private Button buttonup10;
    private Button buttonup20;
    private Button buttonexsercise;
    private Button buttoncheck;
    private EditText Etenswer ;
    private TextView TVseconednum;
    private TextView  TVfirstnum;
    private int score ;
    private User nom1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Intent intent= getIntent();
        String username=intent.getStringExtra("userkey");
       Toast.makeText(MainActivity.this,username,Toast.LENGTH_SHORT).show();
       User nom1 = new User(username);


        excallback=new Excallback() {
            @Override
            public void showNumber(int number1, int number2, int score) {
            TVfirstnum.setText(number1+"");
            TVseconednum.setText(number2+"");
            }
        };




        Excallback Excallback;
        e1 = new Exercise(excallback);
        TVfirstnum=findViewById(R.id.TVfirstnum1);
        Etenswer=findViewById(R.id.Etenswer);
        TVseconednum=findViewById(R.id.TVseconednum);
        buttoncheck=findViewById(R.id.buttoncheck);


        excallback = new Excallback() {
            @Override
            public void showNumber(int number1, int number2,int score1) {
                TVfirstnum.setText(number1);
                TVseconednum.setText(number2);
                score=score1;

            }
        };
        buttonexsercise=findViewById(R.id.buttonexsercise);
        buttonexsercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.upto100();
            }
        });

        buttonup20=findViewById(R.id.buttonup20);
        buttonup20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               e1.upto20();
            }
        });

        buttonup10 = findViewById(R.id.buttonup10);
        buttonup10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            e1.upto10();
            }
        });
        buttoncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(e1.check(Etenswer.getText().toString())) {
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                    nom1.TrackScore(score);

                }else
                    Toast.makeText(MainActivity.this,"fail",Toast.LENGTH_SHORT).show();
                score=0;
            }

        });





    }




}