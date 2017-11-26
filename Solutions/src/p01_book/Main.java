package p01_book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Task 1
    /*public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
    }*/
    //Task 2
    /*
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Library<Book> library = new Library<>(bookOne, bookTwo, bookThree);

        for (Book book : library) {
            System.out.println(book.getTitle());
        }
    }*/
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
        } else {
            System.out.println("Book are equal");
        }

    }



}
