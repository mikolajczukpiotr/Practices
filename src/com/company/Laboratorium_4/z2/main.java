package com.company.Laboratorium_4.z2;

public class main {
    public static void main(String[] args) {
        punkt point = new punkt(3, 5);

        point.countDistance(10, 20);

        punkt point2 = new punkt(10, 20);

        point.countDistance(point.x1, point.y1);
    }
}
