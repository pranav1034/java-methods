import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for month and day
        System.out.print("Enter the month(1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the day(1-31): ");
        int day = sc.nextInt();

        // Checking if the given date falls in the Spring Season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }

    // Method to check if the date falls in the Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }
}
