package task12.Comparators;

import task12.Book;

import java.util.Comparator;

public class SortByName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.GetTitle().compareTo(o2.GetTitle());
    }
}
