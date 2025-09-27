import java.util.Scanner;

public class LineEquation {

    static double x1, y1, x2, y2;

    public static double distance() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return dist;
    }

    public static void equation() {
        double m = (y2 - y1) / (x2 - x1); 
        double b = y1 - m * x1; 
        System.out.println("Equation of line: y = " + m + "x + " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        y2 = sc.nextDouble();

        double dist = distance();
        System.out.println("Euclidean Distance: " + dist);

        equation();
    }
}
