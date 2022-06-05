package DesignPatternDemo;

import DesignPatternDemo.Presents.Present;

public class MainDemo {
    public static void main(String[] args) {

        SantaClaus santa = SantaClaus.getSingleton();
        Workshop newWorkshop = new Workshop();
        Dwarf newDwarf = new Dwarf(newWorkshop);

        String requestOne = santa.getMagicalBoard().wantBike();
        Present presentFromWorkshopOne = newDwarf.getPresentFromWorkshop(requestOne);
        presentFromWorkshopOne.presentCreated();

        String requestTwo = santa.getMagicalBoard().wantDoll();
        Present presentFromWorkshopTwo = newDwarf.getPresentFromWorkshop(requestTwo);
        presentFromWorkshopTwo.presentCreated();

//        Exception Test
//        Present failedPresent = newDwarf.getPresentFromWorkshop("BALL");

    }
}
