import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Calling method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Printing output
        System.out.println("Each child gets: " + result[0] + " chocolates, Remaining chocolates: " + result[1]);
    }

    // Method to calculate chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;

        return new int[]{chocolatesPerChild, remainingChocolates};
    }
}
