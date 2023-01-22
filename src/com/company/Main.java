package com.company;

import com.company.train.freightTrain;
import com.company.train.peopleTrain;
import com.company.wagon.*;


public class Main {

    public static void main(String[] args) {
        int totWeightp = 0;
        int totWeightf = 0;

        freightTrain feight = new freightTrain();
        peopleTrain passenger = new peopleTrain();


        Wagon[] gruz = new Wagon[4];
        gruz[0] = new Locomotive(3700, 25);
        gruz[1] = new FreightWagon(3650, 25, 4500, "Coal");
        gruz[2] = new FreightWagon(3650, 25, 5500, "Iron");
        gruz[3] = new FreightWagon(3650, 25, 5200, "Gold");

        System.out.println("Info about driver of Feight Train: "+feight);
        System.out.println("Info about train:");

        System.out.println(gruz[0]);
        int j=0;
        for (Wagon wagon : gruz) {
            j++;
            System.out.println("Wagon: ");
            feight.giveInfo(wagon);
        }


        for (int i = 0;i<4;i++){
            totWeightf+= gruz[i].totalWeight();
        }

        System.out.println("Total weight of Feight Train: " +totWeightf+"kg");
        System.out.println("Maximum speed of Feight Train: "+Math.sqrt(gruz[0].getPower()*600/totWeightf)+"km/h");

        Wagon[] pass = new Wagon[6];
        pass[0] = new Locomotive(3700,25);
        pass[1] = new Economy(3650,35,30,14);
        pass[2] = new Economy(3650,35,28,14);
        pass[3] = new Lux(3650,45,29,12);
        pass[4] = new Lux(3650,45,20,12);
        pass[5] = new Lux(3650,45,20,12);
        System.out.println("Info about driver of Passenger Train: "+passenger);
        System.out.println("Info about train:");

        System.out.println(pass[0]);
        int k=0;
        for (Wagon wagon : pass){
            k++;
            System.out.println("Wagon: ");
            passenger.giveInfo(wagon);
        }

        for (int i = 0;i<6;i++){
            totWeightp += pass[i].totalWeight();
        }

        System.out.println("Total weight of Passenger Train: " +totWeightp+"kg");
        System.out.println("Maximum speed of Passenger Train: "+Math.sqrt(pass[0].getPower()*400/totWeightp)+"km/h");
    }
}

