import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for N
        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = findSumOfNaturalNumbers(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }
    }

    // Method to find the sum of N natural numbers
    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
