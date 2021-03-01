package com.company.Laboratorium_5.z1;

public class tv {
    boolean on;
    int volume;
    int channel;

    public tv(){
        this.channel = 1;
        this.volume = 1;
        this.on = false;
    }

    public boolean isOn() {
        if(this.on == false){
            System.out.println("telewizor jest wyłączony ;<");
        }
        return this.on;
    }
}
