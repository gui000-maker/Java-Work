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

        switch (word) {
            case "end" -> {
                System.out.print("Bye bye!");
                return;
            }
            case "add" -> {
                System.out.print("Word: ");
                word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                start();
            }
            case "search" -> {
                System.out.print("To be translated: ");
                word = scanner.nextLine();
                String translate = dictionary.translate(word);
                if (translate == null) {
                    System.out.println("Word " + word + " was not found");
                }
                else {
                    System.out.println("Translation: " + translate);
                }
                start();
            }
        }
        System.out.println("Unknown command");
        start();
    }
}
