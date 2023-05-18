package com.galbur.accessmodifiers.peopleevidence;

public class Person {

// Declaring Class Person proprieties

    public String sex;
    public int age;
    public final long id;
    String profession;
    public boolean isRetired;
    public String name;
    public String surname;
    private String residence;

//    Defining 2 constructors, one contains all proprieties, another one only 3 of them: name, surname and id

//    1st Constructor
    public Person(String name, String surname, long id, String sex, int age, String profession, boolean isRetired, String residence) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.sex = sex;
        this.age = age;
        this.profession = profession;
        this.isRetired = isRetired;
        this.residence = residence;
        System.out.println("An Object Person has been created with 8 formal parameters");
    }
//    2nd Constructor
    public Person(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        System.out.println("An Object Person has been created with 3 formal parameters");
    }

    // bellow using toString method in order to easier to have all the variables data gethered when printing the object info
    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", profession='" + profession + '\'' +
                ", isRetired=" + isRetired +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", residence='" + residence + '\'' +
                '}';
    }
}
