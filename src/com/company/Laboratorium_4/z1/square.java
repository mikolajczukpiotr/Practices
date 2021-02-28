package com.company.Laboratorium_4.z1;
        public class square {
    int field;
    int circuit;

    square (int a){
        this.field = a;
        this.circuit = a;
    }
    void countField(){
        System.out.println("pole: " + this.field*this.field);
    }
    void countCircuit(){
        System.out.println("obwod: "+ this.field*4);
    }
        }