import java.util.*;

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

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        return sumOfDigits(square) == num;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int num) {
        int[] factors = findFactors(num);
        return factors[factors.length - 2];
    }

    public static int sumOfFactors(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int num) {
        long product = 1;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static long productOfCubeOfFactors(int num) {
        long product = 1;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        return sumOfFactors(num) - num == num;
    }

    public static boolean isAbundantNumber(int num) {
        return sumOfFactors(num) - num > num;
    }

    public static boolean isDeficientNumber(int num) {
        return sumOfFactors(num) - num < num;
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int[] digits = getDigitsArray(num);
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == num;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
	
	System.out.println("Count of Digits: " + countDigits(num));
        System.out.println("Digits Array: " + Arrays.toString(getDigitsArray(num)));
        System.out.println("Reversed Digits Array: " + Arrays.toString(reverseDigitsArray(getDigitsArray(num))));
	findLargestAndSecondLargest(num);
        findSmallestAndSecondSmallest(num);
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
        System.out.println("Is Armstrong Number? " + isArmstrong(num));
        System.out.println("Sum of Digits: " + sumOfDigits(num));
        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Factors: " + Arrays.toString(findFactors(num)));
        System.out.println("Greatest Factor: " + greatestFactor(num));
        System.out.println("Sum of Factors: " + sumOfFactors(num));
        System.out.println("Product of Factors: " + productOfFactors(num));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(num));
        System.out.println("Is Perfect Number? " + isPerfectNumber(num));
        System.out.println("Is Abundant Number? " + isAbundantNumber(num));
        System.out.println("Is Deficient Number? " + isDeficientNumber(num));
        System.out.println("Is Strong Number? " + isStrongNumber(num));
    }
}


