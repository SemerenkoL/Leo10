package com.company;

public class BmwAutoMechanical implements AutoMechanical {
    public BmwAutoMechanical() {
        System.out.println("BMW завод производит BMW с механической коробкой передач");
    }

    public void drive() {
        System.out.println("Предложение BMW");
    }
}
