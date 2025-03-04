import java.util.Scanner;

public class CalculateFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Getting factors
        int[] factors = findFactors(num);

        // Calculating sum, product, and sum of squares
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumOfSquares = sumOfSquareOfFactors(factors);

        // Displaying factors
        System.out.print("Factors of " + num + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nSum of Factors: " + sum);
        System.out.println("Product of Factors: " + product);
        System.out.println("Sum of Square of Factors: " + sumOfSquares);

        sc.close();
    }

    // Method to find factors of a number
    public static int[] findFactors(int num) {
        int count = 0;

        // First loop to count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate sum of square of factors
    public static int sumOfSquareOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }
}
