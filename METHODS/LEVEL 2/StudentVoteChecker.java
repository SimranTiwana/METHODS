import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canVote(int age) {
        boolean result;
        if (age < 0) {
            result = false;
        } else if (age >= 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = sc.nextInt();

            boolean eligible = canVote(age);
            if (eligible) {
                System.out.println("Student " + i + " with age " + age + " can vote.");
            } else {
                System.out.println("Student " + i + " with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}
