package com.galbur.zooclubservice;

public class Execution {
    public static void main(String[] args) {

        Animal dog1 = new Dog("Buddy");
        Animal cat1 = new Cat("Marry");
        Dog dog2 = new Dog("Many");
        Cat cat2 = new Cat("Kitty");

        dog1.makeSound();
        dog1.eat();
        cat1.makeSound();
        cat1.eat();
        dog2.makeSound();
        dog2.eat();
        cat2.makeSound();
        cat2.eat();

    }
}
