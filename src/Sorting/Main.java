package Sorting;

public class Main {
    static void main() {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + Main.smallest(numbers));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }
        return smallest;
    }
}
