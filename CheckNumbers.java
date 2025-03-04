import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Checking each number
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.println(num + " is Positive");
                if (isEven(num)) {
                    System.out.println(num + " is Even");
                } else {
                    System.out.println(num + " is Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Comparing first and last element
        int comparison = compare(numbers[0], numbers[4]);
        if (comparison > 0) {
            System.out.println("First number is greater than last number.");
        } else if (comparison < 0) {
            System.out.println("First number is less than last number.");
        } else {
            System.out.println("First number is equal to last number.");
        }

    }

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }
}
