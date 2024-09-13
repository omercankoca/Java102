package BookCase;

import java.util.Date;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int pageCount;
    private int publicationYear;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book(String title, String author, int pageCount, int publicationYear) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
    @Override
    public String toString(){
        return "Title " + this.title +
                ", Author " + this.author +
                ", Page Count " + this.pageCount +
                ", Publication Date " + this.publicationYear;
    }
}
