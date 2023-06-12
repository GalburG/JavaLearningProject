package com.galbur.bookcollectiontask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryName;
    private List<Book> bookList;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        bookList = new ArrayList<>();
    }

    public void addBook(Book inputBook) {
        bookList.add(inputBook);
    }

    public int returnBooksNumber() {
        return bookList.size();
    }

    public void removeBook(int elementPositon) {
        try {
            Book deleteBook = bookList.remove(elementPositon);
            System.out.println("This book was deleted: " + deleteBook.getTitle());
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Please review the intex for element position" + exception.getMessage());
        }
    }

    public void removeBook(Book removedBook) {
        boolean isDeleted = bookList.remove(removedBook);
        if (isDeleted) {
            System.out.println("The book was deleted: " + removedBook.getTitle());
        } else {
            System.out.println("There is no such a book: " + removedBook.getTitle());
        }
    }

    public void removeBook(String bookTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle() == bookTitle) {
                bookList.remove(i);
                System.out.println("The book deleted was: " + bookTitle);
                break;
            }
        }
    }

    public void printAllTheBooks() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("the Book on position " + i + " is " + bookList.get(i).getTitle() + " by " + bookList.get(i).getAuthor());
        }
    }

    public void addAnotherListOfBooksIntoTheLibraryList(List<Book> anotherListOfBooks) {
        this.bookList.addAll(anotherListOfBooks);
    }

    public List<Book> getBookList() {
        return this.bookList;
    }

    public void existsOrNotBookInTheList(Book existsOrNotBookInTheList) {
        boolean containsBook = bookList.contains(existsOrNotBookInTheList);
        if (containsBook) {
            System.out.println("The library list contains following book: " + existsOrNotBookInTheList.getTitle());
        } else {
            System.out.println("This book is not in the library list : " + existsOrNotBookInTheList.getTitle());
        }
    }

}
