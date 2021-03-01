package com.company.Laboratorium_5.z2;

public enum windmillLevel {
    SLOW(1),
    MEDIUM(5),
    FAST(10);

    public int level;
    windmillLevel(int level){
        this.level = level;
    }
}
