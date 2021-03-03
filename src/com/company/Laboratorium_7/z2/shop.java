package com.company.Laboratorium_7.z2;

public class shop {
    protected String address;
    protected String size;

    public shop(String address, String size) {
        this.address = address;
        this.size = size;
    }

    void getInformation(){
        System.out.println("Nasz sklep znajduje sie na ulicy " + address + " I tworzy produkty o wymiarach " + size);
    }
}
