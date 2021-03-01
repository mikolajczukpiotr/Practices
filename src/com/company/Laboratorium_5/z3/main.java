package com.company.Laboratorium_5.z3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        account users[] = new account[10];
        for (int i = 0; i < users.length; i++) {
            users[i] = new account();
        }

        while (true) {
            System.out.println("Podaj ID konta (Wpisz -1 by wyjsc)");
            int x = scanner.nextInt();
            if (x == -1) {
                break;
            }

            int choice = 0;
            while (choice != 4) {
                System.out.println("1.Sprawdz stan konta \n 2.Wypłać środki \n 3.Wpłać środki \n 4.Wyjdź");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        users[x].information();
                        break;
                    case 2:
                        users[x].withdraw();
                        break;
                    case 3:
                        users[x].deposit();
                        break;
                    case 4:
                        System.out.println("Zegnaj");
                        break;
                }

            }
        }
    }
}
