package com.company.Laboratorium_7.z2;

public class main {
    public static void main(String[] args) {
        shop shop = new shop("urzednicza", "dużych");
        shop.getInformation();
        System.out.println("\n");
        bakery bakery = new bakery("klonowa", "małych");
        bakery.setProducts();
        System.out.println("\n");
        bookshop bookshop = new bookshop("ksiegowa", "małych, ale obszernych w wiedzę");
        bookshop.setProducts();
    }
}
