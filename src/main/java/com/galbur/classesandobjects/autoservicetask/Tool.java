package com.galbur.classesandobjects.autoservicetask;

public class Tool {

    // Defining the objects in the Tool Class

    boolean isElectric;
    boolean isMechanical;
    String toolName;
    double price;

//    Defining 1st Constructor for Tool Class with only one parameter that will display Tool Object with its name only

    public Tool(String toolName) {
        this.toolName = "INSTRUMENT";
    }

//   Defining 2nd Constructor for "T"ool Class without parameters, that will print out "Anew tool has been created,
//   with poor details description

    public Tool() {
        System.out.println("A new tool has been created in this program. No details known about it. " +
                " For details, Tool name is " + this.toolName + " and the price is " + this.price);
        this.toolName = "The Big Screw driver";
    }

}

