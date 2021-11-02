package com.company;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new BmwFactory();
        Paoche paoche = factory.getPaoche();
        paoche.drive();

        CarFactory factory2 = new AudiFactory();
        Yueye yueye = factory2.getYueye();
        yueye.drive();

        CarFactory factory3 = new BmwFactory();
        Sedan sedan = factory3.getSedan();
        sedan.drive();

        CarFactory factory4 = new AudiFactory();
        Sedan sed = factory4.getSedan();
        sed.drive();

        CarFactory factory5 = new BmwFactory();
        AutoMatic autoMatic = factory5.getAutoMatic();
        autoMatic.drive();

        CarFactory factory6 = new AudiFactory();
        AutoMatic autoMatic1 = factory6.getAutoMatic();
        autoMatic1.drive();

        CarFactory factory7 = new BmwFactory();
        AutoMechanical autoMechanical = factory7.getAutoMechanical();
        autoMechanical.drive();

        CarFactory factory8 = new AudiFactory();
        AutoMechanical autoMechanical1 = factory8.getAutoMechanical();
        autoMechanical1.drive();

    }
}
