package com.company.model;

public class Animal {
    public String nome, tipo;
    private int id;
    public double lat, lon, altura, peso;

    public Animal(){
        id = -1;
    }

    public Animal(int id){
        this.id = id;
    }

    public int getId(){
            return this.id;
    }
}
