import java.util.Scanner;

public class NumberChecker {

    static int[] digits;

    public static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    public static void storeDigits(int num) {
        int count = countDigits(num);
        digits = new int[count];
        int temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
    }

    public static boolean isDuckNumber() {
        boolean result = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isArmstrong() {
        int sum = 0;
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(digits[i], n);
        }
        int number = 0;
        for (int i = 0; i < n; i++) {
            number = number * 10 + digits[i];
        }
        return sum == number;
    }

    public static void largestAndSecondLargest() {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }

    public static void smallestAndSecondSmallest() {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        storeDigits(num);

        System.out.println("Count of digits: " + digits.length);
        System.out.println("Digits stored: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number: " + isDuckNumber());
        System.out.println("Is Armstrong Number: " + isArmstrong());

        largestAndSecondLargest();
        smallestAndSecondSmallest();

        sc.close();
    }
}
