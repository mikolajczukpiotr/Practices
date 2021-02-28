package com.company.Laboratorium_4.z2;

import static java.lang.Math.sqrt;

public class punkt {
    int x1, y1;

    punkt(){
        this.x1 = 0;
        this.y1 = 0;
    }

    punkt(int x, int y){
        this.x1 = x1;
        this.y1 = y1;
    }

    void countDistance(int x, int y){
        System.out.println("dystans: " + sqrt((Math.pow(x-this.x1, 2))+ (Math.pow(y-this.y1, 2))));
    }
}
