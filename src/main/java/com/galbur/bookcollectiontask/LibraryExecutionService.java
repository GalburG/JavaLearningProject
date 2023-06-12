package com.galbur.bookcollectiontask;

import com.galbur.Main;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionService {
    public static void main(String[] args) {
        Book book1 = new Book("Amintiri din Copilarie", "Ion Creanga");
        Book book2 = new Book("5 Limbaje ale Iubirii", "Unknown");
        Book book3 = new Book("Cele 30 de chei ale lui Kobaiashi", "Kobaiashi");
        Book book4 = new Book("Lumea dincolo de nori", "Inventat de Mine");

        Library firstLibrary = new Library("Librarius");
        firstLibrary.addBook(book1);
        firstLibrary.addBook(book2);
        firstLibrary.addBook(book2);
        firstLibrary.addBook(book3);
        firstLibrary.addBook(book4);
        System.out.println("Numarul de carti este " + firstLibrary.returnBooksNumber());
//        firstLibrary.removeBook(1);
//        firstLibrary.removeBook(book1);
//        System.out.println("Number of books remained in the list after remove is " + firstLibrary.returnBooksNumber());
        firstLibrary.removeBook("5 Limbaje ale Iubirii");
        System.out.println("Number of books remained in the list after remove is " + firstLibrary.returnBooksNumber());
        firstLibrary.printAllTheBooks();
        System.out.println();
        Library secondLibrary = new Library("FatFrumos");
        secondLibrary.addBook(book1);
        secondLibrary.addBook(book3);
        secondLibrary.addBook(book4);
        System.out.println("Second library contains following books, their bumber is : " + secondLibrary.returnBooksNumber());
        secondLibrary.printAllTheBooks();
        System.out.println();

        // created the mapping between Libraries ,and a key value for each ,in our case given the address as an unique key value
        Map<String,Library>librariesNetwork = new HashMap<>();
        librariesNetwork.put("Str. Petru Zadnipru 18", firstLibrary);
        librariesNetwork.put("Str.Folrilor 8", secondLibrary);

//        using this mapping now, calling them specifying which one by its key and using libraries methods created previously
        System.out.println("First Library has the following books:");
        librariesNetwork.get("Str. Petru Zadnipru 18").printAllTheBooks();
        System.out.println();
        librariesNetwork.get("Str.Folrilor 8").removeBook("Lumea dincolo de nori");
        System.out.println("Second library has left with bellow books: ");
        librariesNetwork.get("Str.Folrilor 8").printAllTheBooks();

        System.out.println();
        librariesNetwork.get("Str. Petru Zadnipru 18").addAnotherListOfBooksIntoTheLibraryList(secondLibrary.getBookList());
        librariesNetwork.get("Str. Petru Zadnipru 18").addAnotherListOfBooksIntoTheLibraryList(firstLibrary.getBookList());
        librariesNetwork.get("Str. Petru Zadnipru 18").printAllTheBooks();

        System.out.println();
        firstLibrary.existsOrNotBookInTheList(book1);
        secondLibrary.existsOrNotBookInTheList(book4);

    }
}
