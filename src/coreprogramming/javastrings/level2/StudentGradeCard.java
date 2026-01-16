package coreprogramming.javastrings.level2;

import java.util.Scanner;

class StudentGradeCard {

    // a) Generate random 2-digit PCM scores
    static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; // P C M

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10; // 10–99
            }
        }
        return scores;
    }

    // b) Calculate total, average, percentage
    static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3]; // total, avg, %

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // c) Calculate grade
    static String[] calculateGrade(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];

            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // d) Display scorecard
    static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            (int) results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t" +
                            grades[i]
            );
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrade(results);

        displayScoreCard(scores, results, grades);
    }
}
