package com.example.mathporjectori;

public class User {
    private String name;
    private int score=0;
    private int rate;
    public User(String name1){
        this.name=name1;
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
    public void setRate(int num){
        rate=num;
    }
    public String getName(){
       return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRate() {
        return rate;
    }
}
