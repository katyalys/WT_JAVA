package task12.Comparators;

import task12.Book;

import java.util.Comparator;

public class SortByAuthorThenName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        var authorCompare = o1.GetAuthor().compareTo(o2.GetAuthor());
        if (authorCompare == 0) {
            var titleCompare = o1.GetTitle().compareTo(o2.GetTitle());
            if (titleCompare == 0) {
                return o1.GetPrice() - o2.GetPrice();
            } else {
                return titleCompare;
            }
        } else {
            return authorCompare;
        }
    }
}

