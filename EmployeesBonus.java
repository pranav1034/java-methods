import java.util.Random;
import java.util.Scanner;

public class EmployeesBonus {

    // Method to generate random salary (5-digit) and random years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numEmployees][2]; // [salary, years of service]

        for (int i = 0; i < numEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000); // Random 5-digit salary
            int yearsOfService = 1 + rand.nextInt(10); // Random years of service (1-10)
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static int[][] calculateNewSalaries(int[][] employeeData) {
        int[][] updatedData = new int[employeeData.length][3]; // [old salary, new salary, bonus]

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            int bonus = (yearsOfService > 5) ? (int) (oldSalary * 0.05) : (int) (oldSalary * 0.02);
            int newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    // Method to display results
    public static void displayResults(int[][] employeeData, int[][] updatedData) {
        int totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("Employee Data:");
        System.out.println();
        System.out.println("Emp ID\tOld Salary\tYears of Service\tNew Salary\tBonus");
        System.out.println();

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = updatedData[i][0];
            int newSalary = updatedData[i][1];
            int bonus = updatedData[i][2];
            int yearsOfService = employeeData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println((i + 1) + "\t" + oldSalary + "\t\t" + yearsOfService + "\t\t\t" + newSalary + "\t\t" + bonus);
        }

        System.out.println();
        System.out.println("Total\t" + totalOldSalary + "\t\t\t\t\t" + totalNewSalary + "\t\t" + totalBonus);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployees = 10; // As per the problem statement

        // Generate employee data
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate new salaries and bonuses
        int[][] updatedData = calculateNewSalaries(employeeData);

        // Display results
        displayResults(employeeData, updatedData);
    }
}
