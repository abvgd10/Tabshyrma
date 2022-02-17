package com.company;

public class BMW extends Car implements OperateCar{
    public BMW(String name, String model, String nomer) {
        super(name, model, nomer);
    }

    @Override
    public void turn() {
        System.out.println("Павернул на право");
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
