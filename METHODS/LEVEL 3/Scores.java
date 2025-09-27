import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];   
        int[] total = new int[n];
        double[] avg = new double[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 50) + 50; 
            marks[i][1] = (int)(Math.random() * 50) + 50; 
            marks[i][2] = (int)(Math.random() * 50) + 50; 

            total[i] = marks[i][0] + marks[i][1] + marks[i][2];
            avg[i] = Math.round((total[i] / 3.0) * 100.0) / 100.0;
            percent[i] = Math.round((total[i] / 300.0 * 100) * 100.0) / 100.0;

            if (percent[i] >= 80) grade[i] = "A";
            else if (percent[i] >= 70) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 50) grade[i] = "D";
            else if (percent[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }

        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] +
                               "\t" + total[i] + "\t" + avg[i] + "\t" + percent[i] + "%" + "\t" + grade[i]);
        }

        sc.close();
    }
}
