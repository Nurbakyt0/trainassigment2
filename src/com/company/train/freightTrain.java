package com.company.train;

import com.company.driver.Professionals;
import com.company.wagon.Wagon;

public class freightTrain {
    Professionals driver = new Professionals("Nurbakyt Tagaibek","10");

    public void giveInfo(Wagon wagon){
        System.out.print("Weight: "+wagon.weight+"kg || ");
        System.out.print("Volume: "+wagon.volume+"m3 || ");
        System.out.print("Product: "+wagon.getProduct()+" || ");
        System.out.println("Total weight of wagon: "+wagon.totalWeight()+"kg");

    }





    public String toString(){
        return  "\n"+driver.name+"\n"
                +"Exprerience: "+driver.exp+" years";
    }
}

