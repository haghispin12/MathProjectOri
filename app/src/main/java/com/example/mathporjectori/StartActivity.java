package com.example.mathporjectori;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartActivity extends AppCompatActivity {
    private Button sub;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initeview();

        SharedPreferences sh1 = getSharedPreferences("internalName",MODE_PRIVATE);
        String S1 =sh1.getString("name","");
        name.setText(S1);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(StartActivity.this,MainActivity.class);
                intent.putExtra("userkey",name.getText().toString());;
                SharedPreferences sharedPreferences1 = getSharedPreferences("internalName", MODE_PRIVATE);
                SharedPreferences.Editor myEdit= sharedPreferences1.edit();
                myEdit.putString("name",name.getText().toString());
                myEdit.apply();
                startActivity(intent);
            }
        });


    }

    private void initeview() {
        name=findViewById(R.id.dwewd);
        sub=findViewById(R.id.reuiv);
    }

}