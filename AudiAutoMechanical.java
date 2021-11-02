package com.company;

public class AudiAutoMechanical implements AutoMechanical{
    public AudiAutoMechanical() {
        System.out.println("Audi завод производит Audi с механической коробкой передач");
    }

    public void drive() {
        System.out.println("Audi седан, работающий на дороге");
    }
}
