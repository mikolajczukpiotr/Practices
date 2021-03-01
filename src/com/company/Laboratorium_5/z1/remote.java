package com.company.Laboratorium_5.z1;

public class remote {

    tv televisor = new tv();

    public void setTelevisor() {
        if(televisor.on == false){
            televisor.on = true;
            System.out.println("Telewizor został włączony");
        }
        else{
            televisor.on = false;
            System.out.println("Telewizor został wyłączony");
        }
    }
    public void channel(String upOrDown){
        if (televisor.isOn() == true){
            if ((upOrDown == "up") && (televisor.channel <20) && (televisor.channel > 0)){
                televisor.channel++;
            } else if((upOrDown == "down") && (televisor.channel <20) && (televisor.channel > 0)){
                televisor.channel--;
            }
            System.out.println("Kanał telewizora została zmieniona na: " +televisor.channel);
        }
    }
    public void volume (String upOrDown){
        if (televisor.isOn() == true){
            if ((upOrDown == "up") && (televisor.volume <40) && (televisor.volume > 0)){
                televisor.volume++;
            } else if((upOrDown == "down") && (televisor.volume <40) && (televisor.volume > 0)){
                televisor.volume--;
            }
            System.out.println("Głośność telewizora została zmieniona na: " +televisor.volume);
        }
        }
    }
