package Sorting;

public class Main {
    static void main() {
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(Main.indexOfSmallestFrom(numbers, 0));
        System.out.println(Main.indexOfSmallestFrom(numbers, 1));
        System.out.println(Main.indexOfSmallestFrom(numbers, 2));
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

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[smallestIndex] > table[i]) {
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
