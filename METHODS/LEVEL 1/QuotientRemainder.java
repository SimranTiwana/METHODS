import java.util.Scanner;

public class QuotientRemainder {
    static void findQuotientRemainder(int a, int b) {
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        findQuotientRemainder(num1, num2);

        sc.close();
    }
}
