package task12.Comparators;

import task12.Book;

import java.util.Comparator;

public class SortByNameThenAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        var titleCompare = o1.GetTitle().compareTo(o2.GetTitle());
        return titleCompare != 0 ? titleCompare : o1.GetAuthor().compareTo(o2.GetAuthor());
    }
}
