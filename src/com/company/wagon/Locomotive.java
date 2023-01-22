package com.company.wagon;

import com.company.engine.Dvizhok;

public class Locomotive extends Wagon {
    Dvizhok dvizhok = new Dvizhok();

    public Locomotive(double weight, double volume) {
        super(weight, volume);
    }

    public Dvizhok getDvizhok() {
        return dvizhok;
    }


    public void setDvizhok(Dvizhok dvizhok) {
        this.dvizhok = dvizhok;
    }

    @Override
    public double totalWeight(){
        return weight;
    }

    public String toString(){
        return "Lokomotiv: "+"\n"+"Engine power: "+ dvizhok.power+" || Manufacturer: "+ dvizhok.manufacturer;
    }

    @Override
    public double getPower(){
        return dvizhok.power;
    }

}
