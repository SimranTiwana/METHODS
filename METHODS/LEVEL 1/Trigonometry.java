import java.util.Scanner;

public class Trigonometry {
    public static void calculate(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        System.out.println("Sine of " + angle +" is "+ sine);
        System.out.println("Cosine of " + angle + " is "+ cosine);
        System.out.println("Tangent of " + angle +" is "+  tangent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        calculate(angle);

        sc.close();
    }
}
