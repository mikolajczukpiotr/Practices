package com.company.Laboratorium_3;
import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wielkośc tablicy:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i=0; i < size; i++){
            System.out.println("Podaj liczeb na pozycji ["+i+"]");
            array[i] = scanner.nextInt();
        }
        for (int x : array){
            System.out.println(x);
        }
    }
}
