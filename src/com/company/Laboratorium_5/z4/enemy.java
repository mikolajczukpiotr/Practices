package com.company.Laboratorium_5.z4;

import java.util.Scanner;

public class enemy {
    Scanner scanner = new Scanner(System.in);
    int health;
    int damage;
    int armor;

    enemy(){
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    public void chooseEq(){
        System.out.println("Wybierz swoja klase\n1. 'Gierczyk', 100HP, 10DMG, 2ARM\n2. 'Krzystof', 60HP, 5DMG, 20ARM\n3. 'Powover', 10HP, 80DMG, 0ARM");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                health = 100;
                damage = 10;
                armor = 2;
                break;
            case 2:
                health = 60;
                damage = 50;
                armor = 20;
                break;
            case 3:
                health = 10;
                damage = 80;
                armor = 0;
                break;
        }
    }
}
