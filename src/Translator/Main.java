package Translator;

import java.util.Scanner;

public class Main {
    static void main() {
  /*
        SimpleDictionary book = new SimpleDictionary();
//        book.add("one", "yksi");
//        book.add("two", "kaksi");

        System.out.println(book.translate("one"));
        System.out.println(book.translate("two"));
        System.out.println(book.translate("three"));
*/
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
    }
}
