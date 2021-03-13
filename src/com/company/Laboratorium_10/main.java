package com.company.Laboratorium_10;

public class main {
    public static void main(String[] args) {
        kwadrat Kwadrat = new kwadrat(6);
        prostokat Prostokat = new prostokat(3,5);
        trojkat Trojkat = new trojkat(6, 6, 6,12);

        System.out.println("kwadrat obwod: "+Kwadrat.obliczObwod() + "pole: " + Kwadrat.obliczPole());
        System.out.println("prostokat obwod: "+Prostokat.obliczObwod() + "pole: " + Prostokat.obliczPole());
        System.out.println("Trojkat obwod: "+Trojkat.obliczObwod() + "pole: " + Trojkat.obliczPole());

    }
}
