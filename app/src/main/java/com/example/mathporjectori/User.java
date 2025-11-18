package com.example.mathporjectori;

public class User {
    private String name;
    private int score=0;
    private int rate;
    public User(String name){
        name=this.name;
    }
    public User(String name,int score,int rate){
        name=this.name;
        score=this.score;
        rate=this.rate;
    }
    public void TrackScore(int num){
        score+=num;
    }
    public int  ReturnEnswer(){
        return score;
    }
}
