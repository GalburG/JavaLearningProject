package com.galbur.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

//     Object Declaration and Initialisation using all types of Constructors
        System.out.println();
        System.out.println("Running the code for ManageAutoService Class. Result as follows below:");
        Car vehicleWithVinCode01 = new Car("Opel", "Astra", "Red", 2000, 320000);
        System.out.println();
        System.out.println("This is car VIN_01 with following details" + vehicleWithVinCode01.manufacturer + "," + vehicleWithVinCode01.model
                + "," + vehicleWithVinCode01.colour + "," + vehicleWithVinCode01.year + "," + vehicleWithVinCode01.kmWhenEnteredInService);

        Car vehicleWithVinCode02 = new Car("KTR001", 252300);
        vehicleWithVinCode02.colour = "Blue";
        vehicleWithVinCode02.manufacturer = "Ford";
        vehicleWithVinCode02.model = "Mustang";
        System.out.println();
        System.out.println("This is car VIN_02 with following details");
        System.out.println("Manufacturer: " + vehicleWithVinCode02.manufacturer);
        System.out.println("Model:" + vehicleWithVinCode02.model);
        System.out.println("Colour:" + vehicleWithVinCode02.colour);
        System.out.println("License Plates Number:" + vehicleWithVinCode02.platesNumber);
        System.out.println("Km when entered in Service:" + vehicleWithVinCode02.kmWhenEnteredInService);

        Garage garage01 = new Garage("BoxA", 14, "18 Petru Zadnipru Street");
        Garage garage02 = new Garage("Ion Domeniuc 12");
        garage02.boxNr = "BoxB";
        garage02.carCapacity = 8;
        System.out.println("Garage" + garage02.boxNr + "with car capacity" + garage02.carCapacity);
        System.out.println();

        Worker workerJohny = new Worker("Johny Bravo", "Mechanic", true);
        workerJohny.age = 34;
        System.out.println("Our best mechanic in town is Johny. His details are: ");
        System.out.println("He's called: " + workerJohny.name + ". He is " + workerJohny.age + " and he is best "
                + workerJohny.specialization + " ever met. And yeah! " + workerJohny.isMale + "! He is a Male :))))");
        System.out.println();
        System.out.println("and let's finish this task with one more Object to declare, initialize, print it, and run it");
        Tool johnysTool = new Tool();
        System.out.println("Johny's tool is ... priceless ))))))");
        System.out.println();
        System.out.println("Finito La Camedia ! )))");
    }
}
