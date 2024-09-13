package BookCase;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Lord of the Rings", "J.R.R. Tolkien", 570,1954);
        Book book2 = new Book("Harry Potter", "J.K. Rowling", 300,2001);
        Book book3 = new Book("Dune", "Frank Herbert", 703,1965);
        Book book4 = new Book("The man in the High Castle", "Philip K. Dickens", 270,2020);
        Book book5 = new Book("A Clockwork Orange", "Anthony Burgess", 320,1962);


        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
