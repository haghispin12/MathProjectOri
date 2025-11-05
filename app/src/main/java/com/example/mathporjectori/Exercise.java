package com.example.mathporjectori;

import java.util.Random;

public class Exercise {
    private Excallback excallback;


    private int num1;
    private int num2;
    private String enswer;

    public Exercise(Excallback excallback) {
        this.excallback = excallback;
    }
    public Exercise() {

    }

    public void upto10() {

        Random r = new Random();
        num1 = r.nextInt(10) + 1;
        num2 = r.nextInt(10) + 1;
        enswer=(num2 * num1 + "");
        excallback.showNumber(num1,num2);

    }

    public void upto20() {
        Random r = new Random();
        num1 = r.nextInt(10) + 10;
        num2 = r.nextInt(10) + 1;
        enswer=(num2 * num1 + "");
        excallback.showNumber(num1,num2);
    }

    public void upto100() {
        Random r = new Random();
        num1 = r.nextInt(10) + 1;
        num2 = r.nextInt(100) + 10;
        enswer=(num2 * num1 + "");
        excallback.showNumber(num1,num2);
    }
    public boolean check(String answer){
        if(answer.equals(enswer))
            return true;
        return false;
    }


}

