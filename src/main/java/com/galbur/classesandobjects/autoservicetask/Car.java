package com.galbur.classesandobjects.autoservicetask;

public class Car {

    // Defining the objects in the Car Class

    String model;
    String manufacturer;
    long year;
    long kmWhenEnteredInService;
    String platesNumber;
    String colour;

    //Defining 1st Constructor with 3 parameters, which will create an object Car with known parameters manufacturer,
    // model and colour
    public Car(String manufacturer, String model, String colour, long year, long kmWhenEnteredInService) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.kmWhenEnteredInService = kmWhenEnteredInService;
    }

//    Defining 2nd Constructor with only 1 parameter, that will create an object Car where we know only the platesNumber

    public Car(String platesNumber, long kmWhenEnteredInService) {
        this.platesNumber = platesNumber;
        this.kmWhenEnteredInService = kmWhenEnteredInService;
    }
}
