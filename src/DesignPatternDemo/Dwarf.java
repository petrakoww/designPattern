package DesignPatternDemo;

import DesignPatternDemo.Presents.Present;

public class Dwarf {

    private Workshop workshop;

    public Dwarf(Workshop workshop) {
        this.workshop = workshop;
    }

    public Present getPresentFromWorkshop(String request) {
        return workshop.craftPresent(request);
    }
}
