import java.util.Scanner;

public class NumberChecker {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        boolean result = (sum == n);
        return result;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        boolean result = (sum == product);
        return result;
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        int digits = 0, temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int lastDigits = square % (int) Math.pow(10, digits);
        boolean result = (lastDigits == n);
        return result;
    }

    public static boolean isBuzz(int n) {
        boolean result = (n % 7 == 0 || n % 10 == 7);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Prime? " + isPrime(number));
        System.out.println("Neon? " + isNeon(number));
        System.out.println("Spy? " + isSpy(number));
        System.out.println("Automorphic? " + isAutomorphic(number));
        System.out.println("Buzz? " + isBuzz(number));
    }
}
