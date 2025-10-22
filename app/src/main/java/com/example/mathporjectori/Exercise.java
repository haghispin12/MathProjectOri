package com.example.mathporjectori;

import java.util.Random;

public class Exercise {
    private int num1;
    private int num2;
    private String enswer;

    public void upto10(){

        Random r = new Random();
        num1 = r.nextInt(10) + 1;
        num2 = r.nextInt(90) + 10;
        enswer=(num2*num1+"") ;
    }
    public void upto20(){
        Random r = new Random();
        num1 = r.nextInt(10) + 10;
        num2 = r.nextInt(10) + 1;
        enswer=(num2*num1+"") ;
    }
    public void upto100(){
        Random r = new Random();
        num1 = r.nextInt(10) + 1;
        num2 = r.nextInt(10) + 1;
        enswer=(num2*num1+"");
    }
}
