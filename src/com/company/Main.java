package com.company;

public class Main {

    public static void main(String[] args) {

    OperateCar tesla = new Tesla("Tesla","Tesla 1","A 346 AHG");
        System.out.println(tesla);
        tesla.turn();
        tesla.go();
        tesla.stop();
        System.out.println();

        OperateCar bmw = new BMW("BMW","X6","G 894 YDN");
        System.out.println(bmw);
        bmw.turn();
        bmw.go();
        bmw.stop();
        System.out.println();

        OperateCar tayota = new Tayota("Tayota","camri","T 2348 GHU");
        System.out.println(tayota);
        tayota.turn();
        tayota.go();
        tayota.stop();



    }
}
