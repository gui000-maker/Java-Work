package Translator;

import java.util.Scanner;

public class TextUI {
    private final Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Command: ");
        String word = scanner.nextLine();

        if (word.equals("end")) {
            System.out.println("Bye bye!");
            return;
        } else if (word.equals("add")) {
            System.out.println("Word: ");

        }
        System.out.println("Unknown command");
        start();
    }
}
