package DesignPatternDemo.Presents;

public class Bike implements Present {
    @Override
    public void presentCreated() {
        System.out.println("A Bike was crafted!");
    }
}
