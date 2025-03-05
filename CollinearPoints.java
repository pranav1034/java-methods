import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Slope formula: slopeAB = (y2 - y1) / (x2 - x1), and so on.
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area formula: area = 0.5 * (x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2))
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0; // If area is 0, points are collinear.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for 3 points
        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check collinearity using both methods
        boolean collinearSlope = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Print results
        if (collinearSlope && collinearArea) {
            System.out.println("The points (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ") are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }       
    }
}
