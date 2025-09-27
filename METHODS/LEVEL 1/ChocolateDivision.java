import java.util.Scanner;

public class ChocolateDivision {
    static void divideChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        System.out.println("Each child gets " + each + " chocolates");
        System.out.println("Remaining chocolates: " + remaining);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        divideChocolates(chocolates, children);

        sc.close();
    }
}
