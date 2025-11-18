package GradeStatistics;

import java.util.Scanner;

public class UserInterface {
    GradeStatistics statistics;
    Scanner scanner;

    public UserInterface(GradeStatistics statistics, Scanner scanner) {
        this.statistics = statistics;
        this.scanner = scanner;
    }


    public void start() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("-1")) {
                statistics.printAverages();
                break;
            } else {
                int points = Integer.parseInt(input);
                statistics.addGrade(points);
            }
        }
    }
}