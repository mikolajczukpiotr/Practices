package com.company.Laboratorium_7.z1;

public class cat extends animal {
    String sound;

    public cat(String name, String color, String sound) {
        super(name, color);
        this.sound = sound;
    }

    @Override
    public String toString() {
        return String.format("Zwierze wabi się %s jest koloru %s i wydaje dzwięk: %s", name,color,sound);
    }
}
