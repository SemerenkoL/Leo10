package com.company;


public class BmwFactory implements CarFactory {
    @Override
    public Paoche getPaoche() {
        return new BmwPaoche();
    }

    @Override
    public Yueye getYueye() {
        return new BmwYueye();
    }

    @Override
    public Sedan getSedan() {
        return new BmwSedan();
    }

    @Override
    public AutoMatic getAutoMatic() {
        return new BmwAutoMatic();
    }

    @Override
    public AutoMechanical getAutoMechanical() {
        return new BmwAutoMechanical();
    }
}


