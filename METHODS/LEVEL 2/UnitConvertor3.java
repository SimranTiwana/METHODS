import java.util.Scanner;

public class UnitConverter3 {

    public static double fToC(double f) {
        double c = (f - 32) * 5 / 9;
        return c;
    }

    public static double cToF(double c) {
        double f = (c * 9 / 5) + 32;
        return f;
    }

    public static double lbToKg(double lb) {
        double kg = lb * 0.453592;
        return kg;
    }

    public static double kgToLb(double kg) {
        double lb = kg * 2.20462;
        return lb;
    }

    public static double galToL(double gal) {
        double l = gal * 3.78541;
        return l;
    }

    public static double lToGal(double l) {
        double gal = l * 0.264172;
        return gal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println(f + "F = " + fToC(f) + "°C");

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + "C = " + cToF(c) + "°F");

        System.out.print("Enter Pounds: ");
        double lb = sc.nextDouble();
        System.out.println(lb + " lbs = " + lbToKg(lb) + " kg");

        System.out.print("Enter Kilograms: ");
        double kg = sc.nextDouble();
        System.out.println(kg + " kg = " + kgToLb(kg) + " lbs");

        System.out.print("Enter Gallons: ");
        double gal = sc.nextDouble();
        System.out.println(gal + " gallons = " + galToL(gal) + " liters");

        System.out.print("Enter Liters: ");
        double l = sc.nextDouble();
        System.out.println(l + " liters = " + lToGal(l) + " gallons");

        sc.close();
    }
}
