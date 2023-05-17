package com.galbur.classesandobjects.autoservicetask;

public class Garage {

    // Defining the objects in the Garage Class

    String boxNr;
    String address;
    int carCapacity;

    // 1st Constructor for Garage Class

    public Garage(String boxNr, int carCapacity, String address) {
        this.boxNr = boxNr;
        this.carCapacity = carCapacity;
        this.address = "200 Garage Avenue";
        System.out.println();
        System.out.println("An object Garage was created with following info:");
        System.out.println("Garage " + this.boxNr + " with car capacity: " + this.carCapacity);
        System.out.println("Located on: " + this.address);

    }

    public Garage(String address) {
        this.address = address;
        System.out.println();
        System.out.println("The other Garage, where address is " + this.address);
        System.out.println("Has following info details: ");
    }

}
