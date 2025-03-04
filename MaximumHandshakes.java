import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = calculateHandshakes(n);

        // Display the result
        System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
    }

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
