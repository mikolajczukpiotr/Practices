package com.company.Laboratorium_5.z4;

public class main {
    public static int attack(int damage, int armor){
        if(damage>armor){
            return damage - armor;
        } else{
            return armor - damage;
        }
    }

    public static void main(String[] args) {
        player pl = new player();
        pl.chooseEq();

        enemy en = new enemy();
        en.chooseEq();

        while (true){
            en.health -= attack(pl.damage, en.armor);
            System.out.println("Uderzasz przeciwnika za: "+attack(pl.damage, en.armor) + " i ma teraz ilosc HP: "+ en.health);
            if (en.health <= 1){
                System.out.println("Wygrałeś!");
                break;
            }
            pl.health -= attack(en.damage, pl.armor);
            System.out.println("Przeciwnik uderza cie za: "+ attack(en.damage, pl.armor) + " i masz HP: "+ pl.health);
            if (pl.health <= 1){
                System.out.println("Przegrałeś!");
                break;
            }
        }
    }
}

