package Translator;

import java.util.Scanner;

public class TextUI {
    private final Scanner scanner;
    private final SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.print("Command: ");
        String word = scanner.nextLine();

        if (word.equals("end")) {
            System.out.print("Bye bye!");
            return;
        } else if (word.equals("add")) {
            System.out.print("Word: ");
            word = scanner.nextLine();

            System.out.println("Translation: ");
            String translation = scanner.nextLine();

            dictionary.add(word, translation);
            start();
        }
        System.out.println("Unknown command");
        start();
    }
}
