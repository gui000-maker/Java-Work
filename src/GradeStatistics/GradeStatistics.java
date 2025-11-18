package GradeStatistics;

import java.util.ArrayList;

public class GradeStatistics {
    private final ArrayList<Integer> statistics;

    public GradeStatistics() {
        this.statistics = new ArrayList<>();
    }

    public void addGrade(int points) {
        statistics.add(points);
    }

    public void printAverages() {
        System.out.println("Point average (all): " + Average() + "\n"
                + "Point average (passing): " + AveragePassing()
                + "\nPass percentage: " + PassPercentage() + "\n");
    }

    private String PassPercentage() {
        int passingCount = 0;

        for (int grade : this.statistics) {
            if (grade >= 50) {
                passingCount++;
            }
        }

        return String.valueOf((100.0 * passingCount) / this.statistics.size());
    }

    private String AveragePassing() {
        double sum = 0;
        int passingCount = 0;

        for (int grade : this.statistics) {
            if (grade >= 50) {
                sum += grade;
                passingCount++;
            }
        }

        if (passingCount == 0) {
            return "-";
        } else {
            return String.valueOf(sum / passingCount);
        }
    }

    private String Average() {
        double sum = 0;

        for (int grade : this.statistics) {
            sum += grade;
        }

        return String.valueOf(sum / this.statistics.size());
    }
}
