import java.util.Scanner;

public class EuclideanDistance {

    // Method to compute Euclidean distance
    public static double findEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to compute slope and y-intercept
    public static double[] findEquationOfLine(int x1, int y1, int x2, int y2) {
        double[] equation = new double[2]; // Array to store [m, b]

        // Compute slope (m)
        if (x2 - x1 == 0) {
            System.out.println("The line is vertical (undefined slope).");
            return null;
        }
        double m = (double) (y2 - y1) / (x2 - x1);

        // Compute y-intercept (b)
        double b = y1 - (m * x1);

        // Store values in array
        equation[0] = m;
        equation[1] = b;
        return equation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for two points
        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Compute Euclidean Distance
        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        // Compute Equation of Line
        double[] equation = findEquationOfLine(x1, y1, x2, y2);
        if (equation != null) {
            System.out.printf("Equation of Line: y = %.2fx + %.2f\n", equation[0], equation[1]);
        }
    }
}
