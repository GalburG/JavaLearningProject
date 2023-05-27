package com.galbur.methodstask;

public class ExecutionService {
    public static void main(String[] args) {

        int randomInt = DataGeneratorUtil.getRandomInt(70, 100);
        System.out.println("Variabila random este " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt();
        System.out.println("Variabila random2 este " + randomInt1);

        int randomInt2 = DataGeneratorUtil.getRandomInt(50);
        System.out.println("Variabila random3 este " + randomInt2);

        double randomDoubleNumber = DataGeneratorUtil.getRandomDouble(-1000.0);
        System.out.println("Variabila random4 este " + randomDoubleNumber);

        boolean randomBoleanValue = DataGeneratorUtil.getRandomBolean();
        System.out.println("variabila booleana random este " + randomBoleanValue);

// Here we print already the output of Email generator method
        System.out.println("Email_1 = " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Email_2 = " + DataGeneratorUtil.getRandomEmail());
        System.out.println();

//        Here now we gonna print the auto generated string
        System.out.println("Auto generated string is " + DataGeneratorUtil.randomText(10));
        System.out.println();

//        now the invalid string generated
        System.out.println("Auto generated Invalid string is " + DataGeneratorUtil.randomTextInvalid(10));
        System.out.println();

        Customer ionCustomer = new Customer("Ion", 12, "vanea_bat@gmail.com");
        System.out.println("Our 1st customer is " + ionCustomer.getName() + ", " + ionCustomer.getAge() + ", " + ionCustomer.getEmail());

        ionCustomer.setName("John Macron");
        ionCustomer.setAge(-23);
        ionCustomer.setEmail("Johny@gmail.com");
        System.out.println();
        System.out.println("Our 1st customer after applying a seter is " + ionCustomer.getName() + ", " + ionCustomer.getAge() + ", " + ionCustomer.getEmail());
        System.out.println();

        // here using our random generators methods to populate customer data , and to string method to print all this together

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.randomText(7), DataGeneratorUtil.getRandomInt(120),
                DataGeneratorUtil.getRandomEmail());
        System.out.println("Our random customer Data is " + randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.randomText(11));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(12, 34));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println("Our random customer Data. after setters applied is " + randomDataCustomer.toString());


    }
}
