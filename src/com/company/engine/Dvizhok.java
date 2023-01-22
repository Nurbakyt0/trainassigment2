package com.company.engine;

import java.util.Scanner;

public class Dvizhok {
    Scanner scan = new Scanner(System.in);
    public double power;
    public String manufacturer;

    public Dvizhok(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
    public Dvizhok() {
        System.out.println("Choose Locomotive's manufacturer: ");
        System.out.println("Kazakhstan"+"\n"+"China"+"\n"+"Russian");
        this.manufacturer = scan.nextLine();
        if (manufacturer.equals("Kazakhstan")){
            power = 7000;
        }
        else if (manufacturer.equals("China")){
            power = 9800;
        }
        else if (manufacturer.equals("Russian")){
            power = 8000;
        }
        else{
            System.out.println("We don't have another locomotives");
            
        }
    }



    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
