import java.util.Random;

public class GenerateRandomValues {
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);

        // Display the generated numbers
        System.out.print("Generated numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find average, min, and max
        double[] results = findAverageMinMax(numbers);

        // Display results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        Random r = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = r.nextInt(9000) + 1000; // Generates 4-digit numbers (1000-9999)
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;

        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
}
