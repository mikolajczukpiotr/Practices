package com.company.Laboratorium_8.z2;

public class main {
    public static void main(String[] args) {
        bankA BankA = new bankA();
        bankB BankB = new bankB();
        bankC BankC = new bankC();

        System.out.println(BankA.getBalance() + "usd");
        System.out.println(BankB.getBalance() + "usd");
        System.out.println(BankC.getBalance() + "usd");


    }
}
