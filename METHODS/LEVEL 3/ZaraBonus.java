public class ZaraBonus {

    static double[][] employees = new double[10][2]; 

    public static void generateSalaryAndService() {
        for (int i = 0; i < 10; i++) {
            employees[i][0] = (int) (Math.random() * 90000) + 10000; 
            employees[i][1] = (int) (Math.random() * 10) + 1;       
        }
    }

    public static void displaySummary() {
        double sumOld = 0, sumNew = 0, sumBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");
        for (int i = 0; i < 10; i++) {
            double oldSalary = employees[i][0];
            double years = employees[i][1];
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;

            sumOld += oldSalary;
            sumBonus += bonus;
            sumNew += newSalary;

            System.out.println((i + 1) + "\t" + (int) oldSalary + "\t\t" + (int) years + "\t" + (int) bonus + "\t" + (int) newSalary);
        }

        System.out.println("\nTotal Old Salary: " + (int) sumOld);
        System.out.println("Total Bonus: " + (int) sumBonus);
        System.out.println("Total New Salary: " + (int) sumNew);
    }

    public static void main(String[] args) {
        generateSalaryAndService();
        displaySummary();
    }
}
