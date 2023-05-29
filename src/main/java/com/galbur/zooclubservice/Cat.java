package com.galbur.zooclubservice;

public class Cat extends Animal implements AnimalInterface {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("My Cat's name is " + getName() + " and it says Meau!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats fish !");
    }


}
