package RecipeSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {
    private final ArrayList<Recipe> recipes = new ArrayList<>();

    public void loadRecipes(Scanner scanFile) {
        int lineCount = 1;
        boolean createRecipe = true;
        int index = 0;

            while (scanFile.hasNextLine()) {
                if (createRecipe) {
                    Recipe recipe = new Recipe();
                    recipes.add(recipe);
                    createRecipe = false;
                }

                String row = scanFile.nextLine();

                if (lineCount == 1) {
                    this.recipes.get(index).addName(row);
                    lineCount++;
                } else if (lineCount == 2) {
                    this.recipes.get(index).addTime(row);
                    lineCount++;
                } else if (row.isEmpty()) {
                    lineCount = 1;
                    createRecipe = true;
                    index++;
                } else {
                    this.recipes.get(index).addIngredient(row);
                }
            }
        }

    public void printRecipes() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
        }
    }

    public void searchByName(String searchedWord) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(searchedWord.toLowerCase())) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        }
    }
}
