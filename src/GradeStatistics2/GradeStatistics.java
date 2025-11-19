package GradeStatistics2;

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
                + "Point average (passing): " + AveragePassing() + "\n"
                + "Pass percentage: " + PassPercentage() + "\n"
                + "Grade distribution:" + GradeDistribution() + "\n");
    }

    private String GradeDistribution() {
        int[] gradeCounts = new int[6];
        StringBuilder GradeDistribution = new StringBuilder();

        for (int grade : this.statistics) {
            if (grade < 50) {
                gradeCounts[0]++;
            } else if (grade < 60) {
                gradeCounts[1]++;
            } else if (grade < 70) {
                gradeCounts[2]++;
            } else if (grade < 80) {
                gradeCounts[3]++;
            } else if (grade < 90) {
                gradeCounts[4]++;
            } else {
                gradeCounts[5]++;
            }
        }

        for (int i = 5; i >= 0; i--) {
            GradeDistribution.append(i).append(": ");
            for (; gradeCounts[i] >= 0; gradeCounts[i] -= 1) {
                GradeDistribution.append("*");
            }
            GradeDistribution.append("\n");
        }

        return GradeDistribution.toString();
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