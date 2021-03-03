package com.company.Laboratorium_7.z2;

public class bakery extends shop{
    private String[] products = {"chleb", "hotdog", "bułki"};

    public bakery(String address, String size) {
        super(address, size);
    }
    public void setProducts() {
        super.getInformation();
        System.out.println("W ofercie naszej piekarni mamy:");
        for (String i : products){
            System.out.println(i);
        }
    }
}
