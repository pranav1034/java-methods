import java.util.Scanner;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for 3 numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Calling the method to find smallest and largest
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Printing output
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }

    // Method to find smallest and largest numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));

        return new int[]{smallest, largest};
    }
}

