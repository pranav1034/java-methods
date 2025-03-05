import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    
    // Method to generate random scores for students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + rand.nextInt(51); // Physics (random 50-100)
            scores[i][1] = 40 + rand.nextInt(51); // Chemistry (random 50-100)
            scores[i][2] = 40 + rand.nextInt(51); // Maths (random 50-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        String[] grades = new String[scores.length];
        String[] remarks = new String[scores.length];

        for (int i = 0; i < scores.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                grades[i] = "A";
                remarks[i] = "Level-4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i] = "B";
                remarks[i] = "Level-3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i] = "C";
                remarks[i] = "Level-2, below but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i] = "D";
                remarks[i] = "Level-1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i] = "E";
                remarks[i] = "Level-1, Too below agency-normalized standards";
            } else {
                grades[i] = "F";
                remarks[i] = "Remedial standards";
            }
        }

        // Print the scorecard
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" + 
                               results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\t\t" + grades[i] + "\t" + remarks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Display scorecard
        displayScorecard(scores, results);
        
    }
}
