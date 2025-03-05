import java.util.Scanner;

class NumberChecker {

    // Method to count the digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of a number in an array
    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    // Method to check if a number is an Armstrong Number
    public static boolean isArmstrong(int num) {
        int sum = 0, originalNum = num;
        int[] digits = getDigitsArray(num);
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == originalNum;
    }

    // Method to find the largest and second largest digits in the number
    public static void findLargestAndSecondLargest(int num) {
        int[] digits = getDigitsArray(num);
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    // Method to find the smallest and second smallest digits in the number
    public static void findSmallestAndSecondSmallest(int num) {
        int[] digits = getDigitsArray(num);
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        int[] digits = getDigitsArray(num);
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        int[] digits = getDigitsArray(num);
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad Number
    public static boolean isHarshadNumber(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int num) {
        int[] digits = getDigitsArray(num);
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
        System.out.println("Is Armstrong Number? " + isArmstrong(num));
        findLargestAndSecondLargest(num);
        findSmallestAndSecondSmallest(num);
        System.out.println("Sum of digits: " + sumOfDigits(num));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(num));
        System.out.println("Is Harshad Number? " + isHarshadNumber(num));
        
        int[][] frequency = digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
