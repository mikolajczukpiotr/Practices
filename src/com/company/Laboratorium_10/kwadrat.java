package com.company.Laboratorium_10;

public class kwadrat implements figura {
    double a;
    public kwadrat(double a){
        this.a = a;
    }

    @Override
    public double obliczPole(){
        return a*a;
    }
    @Override
    public double obliczObwod(){
        return a*4;
    }
}
