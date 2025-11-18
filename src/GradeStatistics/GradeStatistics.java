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
        System.out.println("Point average (all): " + calculateAverage() + "\n"
                        + "Point average (passing): " + calculateAveragePassing());
    }

    private String calculateAveragePassing() {
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

    private String calculateAverage() {
        double sum = 0;

        for (int grade : this.statistics) {
            sum += grade;
        }

        return String.valueOf(sum / this.statistics.size());
    }
}
