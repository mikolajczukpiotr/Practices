package com.company.Laboratorium_5.z2;

public class windmill {
    int speed;
    boolean on;
    double radius;
    String color;

    public windmill(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    windmill(){
        this.speed = windmillLevel.SLOW.level;
        this.on = false;
        this.radius = 20;
        this.color = "pink";
    }
    public void informationWindmill(){
        System.out.println("Włączony? " + this.on + "\nPrędkość? " + this.speed + "\nPromień? " + this.radius + "\nKolor? " + this.color);
    }
}
