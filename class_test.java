import java.util.Scanner;

public class class_test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number of worlds: ");
    int iterations = scanner.nextInt();

    int i = 0;

    PrintCount one = new PrintCount();
    one.SetCount(iterations);

    while (i < iterations) {
      System.out.println("Hello world!");
      i = i + 1;
    }
    scanner.close();
  }
}

class PrintCount {
  private int Count;

  void SetCount(int CountSent) {
    Count = CountSent;
    System.out.println("Printed " + Count);
  }
}
