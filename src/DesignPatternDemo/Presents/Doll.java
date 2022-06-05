package DesignPatternDemo.Presents;

public class Doll implements Present {
    @Override
    public void presentCreated() {
        System.out.println("A Doll was crafted!");
    }
}
