package com.company.Laboratorium_5.z3;

import java.util.Scanner;

public class account {
    double balance = 100;
    Scanner scanner = new Scanner(System.in);

    public void deposit(){
        System.out.println("ile chcesz wpłacić kaski?");
        double amount = scanner.nextDouble();
        if(amount>0){
            this.balance += amount;
        }else {
            System.out.println("podana liczba jest nie prawidłowa");
        }
    }
    public void withdraw() {
        System.out.println("ile chcesz wpłacić kaski?");
        double amount = scanner.nextDouble();
        if(amount>0){
            if(amount > this.balance){
                System.out.println("nie masz tyle kaski na koncie");
            }else {
                this.balance-=amount;
            }
        }else{
            System.out.println("podana liczba jest nie prawidłowa");
        }
    }
    public void information(){
        System.out.println("twój stan konta: " + this.balance);
    }
}
