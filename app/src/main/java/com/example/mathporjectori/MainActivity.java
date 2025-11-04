package com.example.mathporjectori;

import android.os.Bundle;
import android.telephony.DataFailCause;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

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
    private String enswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        excallback=new Excallback() {
            @Override
            public void showNumber(int number1, int number2) {

            }
        };




        Excallback Excallback;
        e1 = new Exercise();
        TVfirstnum=findViewById(R.id.TVfirstnum1);
        Etenswer=findViewById(R.id.Etenswer);
        TVseconednum=findViewById(R.id.TVseconednum);
        buttoncheck=findViewById(R.id.buttoncheck);
        buttoncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        excallback = new Excallback() {
            @Override
            public void showNumber(int number1, int number2) {
                TVfirstnum.setText(number1);
                TVseconednum.setText(number2);
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
             String str = Etenswer.getText().toString();

                if (str.equals(enswer))
                    Toast.makeText(MainActivity.this,"success",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"fail",Toast.LENGTH_SHORT).show();
            }
        });



    }




}