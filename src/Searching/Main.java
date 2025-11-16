package Searching;

import java.util.ArrayList;

public class Main {
    static void main() {

    }


    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (Book book : books) {
            if (book.getId() == searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }
}
