package RecipeSearch;

import java.util.Scanner;

public class UserInterface {
    RecipeBook recipeBook;
    Scanner scanner;
    Scanner scanFile;

    public UserInterface(RecipeBook book, Scanner scanner, Scanner scanFile) {
        this.recipeBook = book;
        this.scanner = scanner;
        this.scanFile = scanFile;
    }

    public void start() {
        System.out.println("""
                File to read: recipes.txt
                
                Commands:
                list - lists the recipes
                stop - stops the program""");

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            switch (input) {
                case "list":
                    System.out.println("Recipes:");
                    recipeBook.loadRecipes(scanFile);
                    recipeBook.printRecipes();
                    break;
                case "stop":
                    return;
                default:
                    System.out.println("Unknown command");
            }

        }
    }
}
