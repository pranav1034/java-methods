import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.err.println("Please enter a natural number.");
	    System.exit(0);
        } else {
            // Calculating sum using recursion
            int sumRecursive = sumUsingRecursion(n);

            // Calculating sum using formula
            int sumFormula = sumUsingFormula(n);

            // Displaying results
            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula: " + sumFormula);

            // Validating both sums are equal
            if (sumRecursive == sumFormula) {
                System.out.println("Both methods give the same result.");
            }
        }
    }

    // Method to calculate sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate sum using formula
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
