package com.company;

public class Laboratorium_2 {
//    Zadanie1
public static void main(String[] args) {
    for (int i= 10; i<=20; i++){
        System.out.println(i);
    }
//    Zadanie2
    for(int i= -10; i<=40; i++){
        if(i%2 != 0){
            System.out.println(i);
        }
    }
//    Zadanie3
    int k = -10;
    while(k <= -40){
        if(k%2 != 0) {
            System.out.println(k);
        }
        k+=1;
    }
//Zadanie4
    for (int i= 100; i>=0; i--){
        System.out.println(i);
    }
//    Zadanie5

    for(int i= 1; i<=100; i++){
        if(i%8 == 0){
            System.out.println(i);
        }
    }
}
}
