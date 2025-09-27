public class Football {

    static int[] heights = new int[11];

    public static int sumHeights() {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public static double meanHeight() {
        int sum = sumHeights();
        double mean = (double) sum / heights.length;
        return mean;
    }

    public static int shortestHeight() {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }
        return min;
    }

    public static int tallestHeight() {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
            System.out.print(heights[i] + " ");
        }
        System.out.println();
        System.out.println("Shortest height: " + shortestHeight());
        System.out.println("Tallest height: " + tallestHeight());
        System.out.println("Mean height: " + meanHeight());
    }
}
