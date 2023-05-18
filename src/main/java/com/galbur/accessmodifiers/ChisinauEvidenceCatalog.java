package com.galbur.accessmodifiers;

import com.galbur.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

//    Guys if you comment on not using access modifiers, pls be informed that some of them have changed to public
//    just  be able to tun the code

    public static int totalnumberOfPersons; // Adding a variable, public and static for this class, but out of any method
    // which is meant to count the oblects we create ( persons ). Initial value will be 0 if just declaring the variable
    public static void main(String[] args) {

//        Creating 5 Objects Person, by using those 2 constructors from Person Class.
        System.out.println();
        Person person01 = new Person("John", "McKane", 32433535434423L);
        System.out.println("Person01 is " + person01.name + " " + person01.surname + " with id:" + person01.id);
        person01.isRetired = true;

        // here adding and if and else condition to sort out if true then print 1st , else - means if, 1st condition = false
        // then print 2nd
        if (person01.isRetired) {
            System.out.println("John is an old ass, and retired, watching TV all day long on the couch");
        } else {
            System.out.println("John is still a horse");
        }
        totalnumberOfPersons++; // adding +1 to initial value for tjhis variable, after running the code for 1st object

        System.out.println(); // adding this println just for nice formatting when reading the run results
        Person person02 = new Person("Mike", "Jersy", 3274758523L, "Male", 44,
                "Mechanic", true, "1st Avenue Idaho City");
        System.out.println("Person02 info: " + person02.toString()); // bringing the toString here to print all the values at once with minimal effort

        if (person02.isRetired) {
            System.out.println("Mike is an old fart, and he is retired, playing bingo wit his buddies all day");
        } else {
            System.out.println("Mike is still a working tiger");
        }
        totalnumberOfPersons ++;
        System.out.println();

        Person person03 = new Person("Morgan", "Allween", 32747358523L, "Female", 76,
                "Retired", true, "300North Avenue Idaho City");
        System.out.println("Person03 info: " + person03.toString());
        if (person03.isRetired) {
            System.out.println("Morgan is an old lady, and she is retired");
        } else {
            System.out.println("Morgan is still engaged in work activities");
        }
        totalnumberOfPersons++;
        System.out.println();

        Person person04 = new Person("Edy", "Sabor", 327422358523L, "Male", 32,
                "DrugDealer", false, "Always High Street, Evil City");
        System.out.println("Person04 info: " + person04.toString());
        if (person04.isRetired) {
            System.out.println("Edy is an old bastard, and he is retired");
        } else {
            System.out.println("Edy is still  in business, selling some good shit ");
        }
        totalnumberOfPersons++;
        System.out.println();

        Person person05 = new Person("Anita", "Juaqim", 3274231358523L, "Female", 20,
                "Stripper", false, "Pole Street, Pleasure City");
        System.out.println("Person05 info: " + person05.toString());
        if (person05.isRetired) {
            System.out.println("Anita is an old stripper, but still can shake some ... ))))");
        } else {
            System.out.println("Anita is still hot )))");
        }
        totalnumberOfPersons++;
        System.out.println();
        System.out.println(" Total number of persons interrogated = " + totalnumberOfPersons);

    }
}