package Sorting;

public class Main {
    static void main() {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + Main.indexOfSmallest(numbers));
    }

    private static int indexOfSmallest(int[] numbers) {
        int smallestIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[smallestIndex] > numbers[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
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
