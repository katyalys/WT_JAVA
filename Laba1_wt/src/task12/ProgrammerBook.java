package task12;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    protected ProgrammerBook(Book other) {
        super(other);
    }

    public ProgrammerBook(String language, int level, String title, String author, int price){
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return language + " of level " + level + "; " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook book = (ProgrammerBook) o;
        return level == book.level && language.equals(book.language);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash += 31 * language.hashCode();
        hash += 31 * level;
        return hash;
    }
}
