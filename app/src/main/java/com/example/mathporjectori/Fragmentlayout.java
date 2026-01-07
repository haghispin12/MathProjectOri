package com.example.mathporjectori;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;


public class Fragmentlayout extends Fragment {

    TextView tv;
    private Button addpic;
    private EditText username;
    private TextView score;
    private TextView rating;
    private   Button adduse;
    private User Myuser;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragmentlayout, container, false);
        addpic= view.findViewById(R.id.APButton);
        adduse=view.findViewById(R.id.AUButton);
        rating=view.findViewById(R.id.TvRating);
        score=view.findViewById(R.id.TvScore);
        username=view.findViewById(R.id.EtUser);
        //tv = view.findViewById(R.id.)
        String userStr =getArguments().getString("nom1");
        Gson gson = new Gson();
        Myuser=gson.fromJson(userStr, User.class);
        score.setText(Myuser.getScore()+"");
        rating.setText(Myuser.getRate()+"");
        username.setText(Myuser.getName());



        return view;
    }
}