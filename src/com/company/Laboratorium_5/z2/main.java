package com.company.Laboratorium_5.z2;

public class main {
    public static void main(String[] args) {

    windmill wiatrak = new windmill();
    wiatrak.informationWindmill();

    windmill wiatrak2 = new windmill(
            windmillLevel.FAST.level,
            true,
            30,
            "white"
            );
    wiatrak2.informationWindmill();
}
}
