import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[2][2];
        double[][] b = new double[2][2];

        System.out.println("Enter 4 elements for Matrix 1:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextDouble();

        System.out.println("Enter 4 elements for Matrix 2:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextDouble();

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((a[i][j] + b[i][j]) + "\t");
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((a[i][j] - b[i][j]) + "\t");
            System.out.println();
        }

        System.out.println("Multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((a[i][0]*b[0][j] + a[i][1]*b[1][j]) + "\t");
            System.out.println();
        }

        System.out.println("Transpose of Matrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(a[j][i] + "\t");
            System.out.println();
        }

        double det = a[0][0]*a[1][1] - a[0][1]*a[1][0];
        System.out.println("Determinant of Matrix 1: " + det);

        if(det != 0) {
            System.out.println("Inverse of Matrix 1:");
            System.out.println((a[1][1]/det) + "\t" + (-a[0][1]/det));
            System.out.println((-a[1][0]/det) + "\t" + (a[0][0]/det));
        } else {
            System.out.println("Matrix 1 has no inverse (determinant = 0)");
        }
    }
}
