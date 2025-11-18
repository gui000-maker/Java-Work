package GradeStatistics;

import java.util.ArrayList;

public class GradeStatistics {
    ArrayList<Integer> statistics;

    public GradeStatistics () {
        this.statistics = new ArrayList<>();
    }

    public void addGrade(int points) {
        statistics.add(points);
    }

    public void printAverages() {
        System.out.println("Point average (all): " + calculateAverage(statistics));
    }

    private double calculateAverage(ArrayList<Integer> statistics) {
        double sum = 0;
        for (int grade : statistics) {
            sum += grade;
        }

        return sum / statistics.size();
    }
}
