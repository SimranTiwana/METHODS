import java.util.Scanner;

public class NumberChecker3 {

    static int[] digits;
    static int[] reversedDigits;

    public static void storeDigits(int number) {
        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
    }

    public static void reverseDigits() {
        reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
    }

    public static boolean isPalindrome() {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != reversedDigits[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDuckNumber() {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        storeDigits(number);
        reverseDigits();

        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.print("Reversed: ");
        for (int d : reversedDigits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Palindrome? " + isPalindrome());
        System.out.println("Duck Number? " + isDuckNumber());
    }
}
