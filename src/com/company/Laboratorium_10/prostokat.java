package com.company.Laboratorium_10;

public class prostokat implements figura {
    double a;
    double b;
    public prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole(){
        return a*b;
    }
    @Override
    public double obliczObwod(){
        return (a*2) + (b*2);
    }
}
