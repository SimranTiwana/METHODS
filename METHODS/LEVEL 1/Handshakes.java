import java.util.*;

public class Handshakes {
    public static int calculate(int n) {
        int handshakes = (n * (n - 1)) / 2; 
        return handshakes;                 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("Maximum number of handshakes: " + calculate(n));
    }
}
