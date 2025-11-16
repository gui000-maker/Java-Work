package Searching;

import java.util.ArrayList;

public class Main {
    static void main() {

    }


    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }
}
