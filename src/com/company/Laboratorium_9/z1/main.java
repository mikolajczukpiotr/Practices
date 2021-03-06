package com.company.Laboratorium_9.z1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("podaj imie");
            String imie = scanner.nextLine();

            System.out.println("podaj nazwisko");
            String nazwisko = scanner.nextLine();

            System.out.println("podaj rok urodzenia");
            int rok = scanner.nextInt();

            Osoba osoba = new Osoba(imie, nazwisko, rok);
            System.out.println(osoba);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            main(new String[0]);

        }
    }
}
