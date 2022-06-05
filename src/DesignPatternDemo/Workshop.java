package DesignPatternDemo;

import DesignPatternDemo.Exceptions.NoSuchPresentException;
import DesignPatternDemo.Presents.Bike;
import DesignPatternDemo.Presents.Doll;
import DesignPatternDemo.Presents.Present;

import java.util.Objects;

public class Workshop {

    public Present craftPresent(String type) {

        try {
            if(Objects.equals(type, "DOLL")) {
                return new Doll();
            } else if(Objects.equals(type, "BIKE")) {
                return new Bike();
            } else {
                throw new NoSuchPresentException("These type of present does not exist yet");
            }
        } catch (NoSuchPresentException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
