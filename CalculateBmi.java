import java.util.Scanner;

public class CalculateBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3]; // 10 rows (people), 3 columns (weight, height, BMI)
        String[] statuses = new String[10];

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            people[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            people[i][1] = sc.nextDouble();
        }

        // Calculating BMI and determining status
        for (int i = 0; i < 10; i++) {
            people[i][2] = calculateBMI(people[i][0], people[i][1]);
            statuses[i] = getBMIStatus(people[i][2]);
        }

        // Displaying results in simple string format
        System.out.println("\nBMI Report:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + people[i][0] + " kg, Height = " + people[i][1] + 
                               " cm, BMI = " + people[i][2] + ", Status = " + statuses[i]);
        }
    }

    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height); // BMI formula: weight (kg) / height^2 (m^2)
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
