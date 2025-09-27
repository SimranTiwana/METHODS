import java.util.Scanner;

public class FriendsCheck {

    public static String youngest(String n1, int a1, String n2, int a2, String n3, int a3) {
        String youngest;
        int minAge = a1;

        youngest = n1;
        if (a2 < minAge) {
            minAge = a2;
            youngest = n2;
        }
        if (a3 < minAge) {
            youngest = n3;
        }

        return youngest;
    }

    public static String tallest(String n1, double h1, String n2, double h2, String n3, double h3) {
        String tallest;
        double maxHeight = h1;

        tallest = n1;
        if (h2 > maxHeight) {
            maxHeight = h2;
            tallest = n2;
        }
        if (h3 > maxHeight) {
            tallest = n3;
        }

        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter height of Amar in cm: ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter height of Akbar in cm: ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter height of Anthony in cm: ");
        double heightAnthony = sc.nextDouble();

        String youngestFriend = youngest("Amar", ageAmar, "Akbar", ageAkbar, "Anthony", ageAnthony);
        String tallestFriend = tallest("Amar", heightAmar, "Akbar", heightAkbar, "Anthony", heightAnthony);

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        sc.close();
    }
}
