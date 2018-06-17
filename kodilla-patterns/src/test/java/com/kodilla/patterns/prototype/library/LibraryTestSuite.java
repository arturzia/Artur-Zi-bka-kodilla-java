package com.kodilla.patterns.prototype.library;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        Library library = new Library("Biblioteka");

        Book book1 = new Book("StarWars","Lucas", LocalDate.of(1999,06,21));
        Book book2 = new Book("Independent","Lem", LocalDate.of(1979,06,21));
        Book book3 = new Book("Harry Potter","Rowling", LocalDate.of(1999,06,21));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When


        //Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());

    }
}
