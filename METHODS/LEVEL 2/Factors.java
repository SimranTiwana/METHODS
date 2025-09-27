import java.util.Scanner;

public class Factors {
    public static void findFactors(int num) {
        int sum = 0, product = 1, sumSquares = 0;

        System.out.print("Factors: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                sum += i;
                product *= i;
                sumSquares += i * i;
            }
        }

        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumSquares);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        findFactors(num);

        sc.close();
    }
}
