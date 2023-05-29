package com.galbur.zooclubservice;

public class Dog extends Animal implements AnimalInterface {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(" My Dog " + getName() + " says: Bow Wow! ");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats some bones ");
    }

}
