package com.example.mathporjectori;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Excallback excallback;
    private Exercise e1;
    private Button buttonup10;
    private Button buttonup20;
    private Button buttonexsercise;
    private Button buttoncheck;
    private Button ratebutton;
    private EditText Etenswer;
    private TextView TVseconednum;
    private TextView TVfirstnum;
    private int score;
    private User nom1;

    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            int myrate=result.getData().getIntExtra("ratekey",-1);
            Toast toast = Toast.makeText(MainActivity.this,myrate,Toast.LENGTH_SHORT);
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {//happand first when the activity being first opened
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Intent intent = getIntent();//making the ground for getting intent from startActivity
        String username = intent.getStringExtra("userkey");//gets the values from startActivity
        Toast.makeText(MainActivity.this, username, Toast.LENGTH_SHORT).show();//send up a massage with the user name
        User nom1 = new User(username);//take an  user-object that eill hold the username

/**
 * This gets the number that had been drooled and shows them in the TextVies for the user
 */
//        excallback = new Excallback() {
//            @Override
//            public void showNumber(int number1, int number2, int score) {
//                TVfirstnum.setText(number1 + "");
//                TVseconednum.setText(number2 + "");
//            }
//        };

/**
 * create an Excallback object
 */

        /**
         * all thefind view by id for all
         */
        TVfirstnum = findViewById(R.id.TVfirstnum1);
        Etenswer = findViewById(R.id.Etenswer);
        TVseconednum = findViewById(R.id.TVseconednum);
        buttoncheck = findViewById(R.id.buttoncheck);
        ratebutton= findViewById(R.id.ratebutton);
        buttonup20 = findViewById(R.id.buttonup20);
        buttonup10 = findViewById(R.id.buttonup10);
        buttonexsercise = findViewById(R.id.buttonexsercise);
        excallback = new Excallback() {//send out an object to the ExerciseActivity and there he act some act to change the numbers
            @Override
            public void showNumber(int number1, int number2, int score1) {
                TVfirstnum.setText(number1);
                TVseconednum.setText(number2);
                score = score1;

            }
        };
        //Excallback Excallback;
        e1 = new Exercise(excallback);

        buttonexsercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.upto100();
            }
        });


        buttonup20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.upto20();
            }
        });


        buttonup10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.upto10();
            }
        });
        buttoncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (e1.check(Etenswer.getText().toString())) {
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                    nom1.TrackScore(score);

                } else
                    Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_SHORT).show();
                score = 0;
            }

        });
        ratebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RateActivity.class);
                activityResultLauncher.launch(intent);

            }
        });


    }
}


