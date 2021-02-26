package com.company.Laboratorium_3;

import java.util.Scanner;

public class z6 {
    public static int NWD(int x, int y){

        while (x != y){
            if (x>y){
                x -= y;
            }
            else{
                y -=x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę pierwszą liczbe");
        int first = scanner.nextInt();
        System.out.println("Podaj liczbę drugą liczbe");
        int second = scanner.nextInt();
        System.out.println("wynik:" + NWD(first,second));
    }
}
