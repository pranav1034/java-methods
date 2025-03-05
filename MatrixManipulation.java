import java.util.Random;
import java.util.Scanner;

public class MatrixManipulation {

    // Method to generate a random matrix with given rows and columns
    public static double[][] generateMatrix(int rows, int cols) {
        //Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // Random numbers between 0-9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] mat1, double[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] mat1, double[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] mat1, double[][] mat2) {
        int rows1 = mat1.length, cols1 = mat1[0].length;
        int cols2 = mat2[0].length;
        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is singular, inverse doesn't exist.");

        double[][] inverse = {
            {matrix[1][1] / det, -matrix[0][1] / det},
            {-matrix[1][0] / det, matrix[0][0] / det}
        };
        return inverse;
    }

    // Method to find inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is singular, inverse doesn't exist.");

        double[][] adj = new double[3][3];

        // Finding cofactors and adjugate matrix
        adj[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
        adj[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) / det;
        adj[0][2] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;

        adj[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]) / det;
        adj[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
        adj[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]) / det;

        adj[2][0] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;
        adj[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]) / det;
        adj[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;

        return adj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate two random matrices of size 2x2
        System.out.println("Generating 2x2 matrices...");
        double[][] mat1 = generateMatrix(2, 2);
        double[][] mat2 = generateMatrix(2, 2);

        // Display matrices
        System.out.println("Matrix 1:");
        displayMatrix(mat1);
        System.out.println("Matrix 2:");
        displayMatrix(mat2);

        // Perform operations
        System.out.println("Addition:");
        displayMatrix(addMatrices(mat1, mat2));

        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(mat1, mat2));

        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(mat1, mat2));

        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(mat1));

        System.out.println("Determinant of Matrix 1: " + determinant2x2(mat1));

        System.out.println("Inverse of Matrix 1:");
        displayMatrix(inverse2x2(mat1));

        // Generate a 3x3 matrix
        System.out.println("\nGenerating a 3x3 matrix...");
        double[][] mat3 = generateMatrix(3, 3);
        System.out.println("Matrix 3:");
        displayMatrix(mat3);

        System.out.println("Determinant of Matrix 3: " + determinant3x3(mat3));

        System.out.println("Inverse of Matrix 3:");
        displayMatrix(inverse3x3(mat3));
    }
}
