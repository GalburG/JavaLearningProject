package com.galbur.methodstask;

public class Customer {
    private String name;
    private int age;
    private String email;

    public Customer(String name, int age, String email) {
        this.name = name;
        this.email = email;
        if (age < 1 || age > 127) {
            System.out.println("Invalid age at Constructor");
        } else {
            this.age = age;
        }
    }

    // folosim mai jos un getter pt fiecare parametru pt ai putea folosi in clasa execution , pt a citi datele private din clasa customer
    public String getName() {
        return name;
    }

    //    Now here we gonna use some setters in order to modify the data given in the Constructor
    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 1 || newAge > 127) {
            System.out.println("Invalid age");
        } else {
            this.age = newAge;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    // here bellow an to string method applied in order to get all the parameters concatenated together
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
