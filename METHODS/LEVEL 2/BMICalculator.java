import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter weight (kg) of person " + i + ": ");
            double weight = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + i + ": ");
            double heightCm = sc.nextDouble();

            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            System.out.println("Person " + i + ": Weight=" + weight + "kg, Height=" + heightCm + "cm, BMI=" + bmi + ", Status=" + status);
            System.out.println();
        }

        sc.close();
    }
}
