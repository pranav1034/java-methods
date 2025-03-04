import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        // Calling method
        double windChill = calculateWindChill(temperature, windSpeed);

        // Printing the result
        System.out.println("The Wind Chill temperature is: " + windChill + "°F");
    }

    // Method to calculate Wind Chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
