import java.util.Scanner;

public class NumberChecker2 {

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
        int n = countDigits(num);
        digits = new int[n];
        int temp = num;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
    }

    public static int sumDigits() {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    public static int sumSquares() {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    public static boolean isHarshad() {
        int sum = sumDigits();
        int number = 0;
        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + digits[i];
        }
        return number % sum == 0;
    }

    public static void digitFrequency() {
        int[][] freq = new int[10][2]; // first column = digit, second column = count

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }

        System.out.println("Digit frequencies: ");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        storeDigits(num);

        System.out.println("Count of digits: " + digits.length);
        System.out.print("Digits stored: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + sumDigits());
        System.out.println("Sum of squares of digits: " + sumSquares());
        System.out.println("Is Harshad number: " + isHarshad());

        digitFrequency();

        sc.close();
    }
}
