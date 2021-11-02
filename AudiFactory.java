package com.company;


public class AudiFactory implements CarFactory {
    @Override
    public Paoche getPaoche() {
        return new AudiPaoche();
    }

    @Override
    public Yueye getYueye() {
        return new AudiYueye();
    }

    @Override
    public Sedan getSedan() {
        return new AudiSedan();
    }

    @Override
    public AutoMatic getAutoMatic() {
        return new AudiAutoMatic();
    }

    @Override
    public AutoMechanical getAutoMechanical() {
        return new AudiAutoMechanical();
    }
}




