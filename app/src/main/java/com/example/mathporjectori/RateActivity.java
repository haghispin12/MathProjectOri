package com.example.mathporjectori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RateActivity extends AppCompatActivity {

    private Button buttonrate;
    private SeekBar SK;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rate);
buttonrate=findViewById(R.id.send);
buttonrate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent inn= new Intent();
        inn.putExtra("ratekey",SK.getProgress());
        setResult(RESULT_OK,inn);
        finish();
    }
});


    }

}