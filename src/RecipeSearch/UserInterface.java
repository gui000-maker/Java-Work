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
        recipeBook.loadRecipes(scanFile);

        System.out.println("""
                File to read: recipes.txt
                
                Commands:
                list - lists the recipes
                stop - stops the program
                find name - searches recipes by name""");

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            switch (input) {
                case "list":
                    System.out.println("Recipes:");
                    recipeBook.printRecipes();
                    break;
                case "stop":
                    return;
                    case "find name":
                    System.out.print("Searched word: ");
                    String searchedWord = scanner.nextLine();
                    System.out.println("Recipes:");
                    recipeBook.searchByName(searchedWord);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
