package com.company.train;

import com.company.driver.Professionals;
import com.company.wagon.Wagon;

public class peopleTrain {
    Professionals driver = new Professionals("Daniyar","22");

    public void giveInfo(Wagon wagon){
        System.out.print("Weight: "+wagon.weight+"kg || ");
        System.out.println("Amount of people: "+wagon.getPeople());
        System.out.println("Amount of rooms: "+wagon.getRooms());
        System.out.println("Price for 1 ticket: "+wagon.getCost()+"₸");
    }



    public String toString(){
        return  "\n"+driver.name+"\n"
                +"Exprerience: "+driver.exp+" years";
    }
}
