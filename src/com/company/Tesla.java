package com.company;

public class Tesla extends Car implements OperateCar{
    public Tesla(String name, String model, String nomer) {
        super(name, model, nomer);
    }

    @Override
    public void turn() {
        System.out.println("Павернул на лево");
    }

    @Override
    public void go() {
        System.out.println("Вперет");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
