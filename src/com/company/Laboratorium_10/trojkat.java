package com.company.Laboratorium_10;

public class trojkat implements figura {
    double a;
    double h;
    double b;
    double c;
    public trojkat(double a, double h, double b, double c){
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    @Override
    public double obliczPole(){
        return (a*h)/2;
    }
    @Override
    public double obliczObwod(){
        return a+b+c;
    }
}
