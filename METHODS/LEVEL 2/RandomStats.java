public class RandomStats{

    public static void main(String[] args) {
        int count = 5;
        int sum = 0;
        int min = 9999; 
        int max = 1000;

        System.out.print("Random numbers: ");
        for (int i = 1; i <= count; i++) {
            int num = (int) (Math.random() * 9000) + 1000; 
            System.out.print(num + " ");
            
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / count;

        System.out.println("\nAverage: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
