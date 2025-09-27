import java.util.Scanner;

public class SimpleInterest {
    static void calculateSI(double p, double r, double t) {
        double si = (p * r * t) / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        calculateSI(principal, rate, time);

        sc.close();
    }
}
