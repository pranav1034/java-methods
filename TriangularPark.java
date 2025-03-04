import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate the number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to complete 5 km run.");
    }

    // Method to calculate the number of rounds needed
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // Calculate perimeter of the triangle
        return Math.round(5000 / perimeter); // Calculate rounds
    }
}
