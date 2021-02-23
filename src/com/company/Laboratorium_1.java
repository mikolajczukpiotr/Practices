package com.company;
import java.lang.*;
import java.util.Scanner;

public class Laboratorium_1 {

    public static void main(String[] args) {
//        Zadanie1
        System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");
//        Zadanie2
        double result;
        result = ((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5);
        System.out.println(result);
//        Zadanie3
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj stopnie Celsjusza");
        int degrees  = scan.nextInt();
        double fehren;
        fehren = (degrees * 1.8 + 32);
        System.out.println(fehren);


//        Zadanie4
        System.out.println("Podaj liczbę 1");
        int a = scan.nextInt();
        System.out.println("Podaj liczbę 2");
        int b = scan.nextInt();
        System.out.println("Podaj liczbę 3");
        int c = scan.nextInt();
        if (a + b > c)
            System.out.println("Tak");
        else
            System.out.println("Nie");
//        Zadanie5
        System.out.println("Podaj dzien tygodnia(w liczbie)");
        int numbers = scan.nextInt();
        switch(numbers) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nie poprawna liczba. Mamy tylko 7 dni tygodnia :)");
        }
//        Zadanie6
        double a6, b6, c6;
        System.out.println("Podaj 3 dowolne liczby");
        a6 = scan.nextInt();
        b6 = scan.nextInt();
        c6 = scan.nextInt();
        System.out.println("Największa liczba to:" + Math.max(Math.max(a6, b6), c6));

//        Zadanie7
        double x1, y1, x2, y2;
        System.out.println("Podaj x1 i y1");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.println("Podaj x2 i y2");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        double x = x2 - x1;
        double y = y2 - y1;
        double resultCord = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(resultCord);


    }
}
