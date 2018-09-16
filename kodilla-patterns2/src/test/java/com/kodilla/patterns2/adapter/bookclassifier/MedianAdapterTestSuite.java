package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Stanisław Lem", "Astronauci", 1960, "001");
        Book book2 = new Book("Janusz Zajdel", "Paradyzja", 1990, "002");
        Book book3 = new Book("Philip K. Dick", "Ubik", 1969, "003");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedia = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1969, publicationYearMedia, 0);
    }
}
