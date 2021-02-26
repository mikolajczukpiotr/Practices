package com.company.Laboratorium_3;

import java.util.Arrays;
import java.util.Scanner;

public class z3 {
    public static int[] adding(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wielkość macierzy: ");
        int size = scanner.nextInt();
        int [] array1 = new int[size], array2 = new int[size], array3 = new int[size];

        for (int i=0; i<size;i++){
            System.out.println("Podaj liczbe na pozycji array1["+i+"]");
            array1[i] = scanner.nextInt();
        }
        for (int i=0; i<size;i++){
            System.out.println("Podaj liczbę na pozycji array2["+i+"]");
            array2[i] = scanner.nextInt();
        }
        for (int i=0; i<size;i++){
            array3[i]= array1[i] + array2[i];
        }
        return array3;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(adding()));
    }
}
