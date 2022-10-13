package task12;

public class Book implements Comparable<Book> {
    private final String title;
    private final String author;
    private final int price;
    private static int edition;
    private int isbn;

    public String GetTitle()
    {
        return title;
    }

    public String GetAuthor()
    {
        return author;
    }

    public int GetPrice()
    {
        return price;
    }



    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    protected Book(Book other) {
        title = other.title;
        author = other.author;
        price = other.price;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author + ", " + price + "$";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int hash = 31 * title.hashCode();
        hash += 31 * author.hashCode();
        hash += 31 * price;
        return hash;
    }

    @Override
    public Book clone() {
        return new Book(this);
    }

    @Override
    public int compareTo(Book o) {
        return  Integer.compare(this.isbn, o.isbn);
    }
}
