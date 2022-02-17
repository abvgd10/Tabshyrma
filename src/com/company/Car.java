package com.company;

public abstract class Car {
    private String name;
    private String model;
    private String nomer;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public Car(String name, String model, String nomer) {
        this.name = name;
        this.model = model;
        this.nomer = nomer;


    }

    @Override
    public String toString() {
        return "Car " +
                "name= " + name + '\'' +
                "\n model= " + model + '\'' +
                "\n nomer= " + nomer + '\'' +
                ' ';
    }
}
