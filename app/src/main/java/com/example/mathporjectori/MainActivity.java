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
        TVfirstnum=findViewById(R.id.TVfirstnum1);
        Etenswer=findViewById(R.id.Etenswer);
        TVseconednum=findViewById(R.id.TVseconednum);

        buttoncheck=findViewById(R.id.buttoncheck);
        buttoncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        buttonexsercise=findViewById(R.id.buttonexsercise);
        buttonexsercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=0;
                int num2 = 0;
                TVfirstnum.setText(num1+"");
                TVseconednum.setText(num2+"");
            }
        });

        buttonup20=findViewById(R.id.buttonup20);
        buttonup20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 ;
                int num2 ;
                Random r = new Random();
                num1 = r.nextInt(10) + 10;
                num2 = r.nextInt(10) + 1;
                enswer=(num2*num1+"") ;
                TVfirstnum.setText(num1+"");
                TVseconednum.setText(num2+"");
            }
        });

        buttonup10 = findViewById(R.id.buttonup10);
        buttonup10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 ;
                int num2 ;
                Random r = new Random();
                 num1 = r.nextInt(10) + 1;
                num2 = r.nextInt(10) + 1;
                 enswer=(num2*num1+"");
                TVfirstnum.setText(num1+"");
                TVseconednum.setText(num2+"");
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