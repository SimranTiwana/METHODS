import java.util.Scanner;

public class NumberChecker5 {

    static int[] factors; 

    public static void findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }
    }

    public static int greatestFactor() {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    public static int sumFactors() {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public static int productFactors() {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static double productCubeFactors() {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int f : factors) {
            if (f != n) sum += f; 
        }
        boolean result = (sum == n);
        return result;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int f : factors) {
            if (f != n) sum += f;
        }
        boolean result = (sum > n);
        return result;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int f : factors) {
            if (f != n) sum += f;
        }
        boolean result = (sum < n);
        return result;
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        boolean result = (sum == n);
        return result;
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor());
        System.out.println("Sum of Factors: " + sumFactors());
        System.out.println("Product of Factors: " + productFactors());
        System.out.println("Product of Cubes of Factors: " + productCubeFactors());

        System.out.println("Perfect? " + isPerfect(number));
        System.out.println("Abundant? " + isAbundant(number));
        System.out.println("Deficient? " + isDeficient(number));
        System.out.println("Strong? " + isStrong(number));
    }
}
