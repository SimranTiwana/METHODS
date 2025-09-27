import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int num) {
        boolean result;
        if (num >= 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean isEven(int num) {
        boolean result;
        if (num % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static int compare(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = 1;
        } else if (num1 == num2) {
            result = 0;
        } else {
            result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (result == 0) {
            System.out.println("The first element is equal to the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        sc.close();
    }
}
