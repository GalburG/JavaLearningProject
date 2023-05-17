package com.galbur.classesandobjects.autoservicetask;

public class Worker {

    // Defining the objects in the Worker Class
    String name;
    String specialization;
    int age;
    boolean isMale;

// 1st Worker Class Constructor

    public Worker(String name, String specialization, boolean isMale) {
        this.name = name;
        this.specialization = specialization;
        this.isMale = true;
    }

//    2nd Worker Class Constructor

    public Worker(int age) {
        System.out.println("This is the mechanic's age" + this.age);
    }

}
