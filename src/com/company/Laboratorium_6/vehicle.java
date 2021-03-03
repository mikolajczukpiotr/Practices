package com.company.Laboratorium_6;

public class vehicle {
    engine engine;
    color color;
    size size;

    public vehicle (engine engine, color color, size size) {
        this.engine = engine;
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        return String.format("Samochód o silniku %s wielkości %s i kolorze %s", engine, size, color );
    }
}
