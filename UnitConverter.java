import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unit Converter Menu:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.println("5. Yards to Feet");
        System.out.println("6. Feet to Yards");
        System.out.println("7. Meters to Inches");
        System.out.println("8. Inches to Meters");
        System.out.println("9. Inches to Centimeters");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = convertKmToMiles(value);
                System.out.println(value + " km = " + result + " miles");
                break;
            case 2:
                result = convertMilesToKm(value);
                System.out.println(value + " miles = " + result + " km");
                break;
            case 3:
                result = convertMetersToFeet(value);
                System.out.println(value + " meters = " + result + " feet");
                break;
            case 4:
                result = convertFeetToMeters(value);
                System.out.println(value + " feet = " + result + " meters");
                break;
            case 5:
                result = convertYardsToFeet(value);
                System.out.println(value + " yards = " + result + " feet");
                break;
            case 6:
                result = convertFeetToYards(value);
                System.out.println(value + " feet = " + result + " yards");
                break;
            case 7:
                result = convertMetersToInches(value);
                System.out.println(value + " meters = " + result + " inches");
                break;
            case 8:
                result = convertInchesToMeters(value);
                System.out.println(value + " inches = " + result + " meters");
                break;
            case 9:
                result = convertInchesToCentimeters(value);
                System.out.println(value + " inches = " + result + " cm");
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
