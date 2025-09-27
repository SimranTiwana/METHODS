import java.util.Scanner;

public class CollinearPoints {
    public static boolean checkBySlope(int x1,int y1,int x2,int y2,int x3,int y3){
        int slope1 = (y2-y1)*(x3-x2);
        int slope2 = (y3-y2)*(x2-x1);
        boolean result = (slope1 == slope2);
        return result;
    }

    public static boolean checkByArea(int x1,int y1,int x2,int y2,int x3,int y3){
        int area = x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2);
        boolean result = (area == 0);
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1=sc.nextInt();
        System.out.print("Enter y1: ");
        int y1=sc.nextInt();

        System.out.print("Enter x2: ");
        int x2=sc.nextInt();
        System.out.print("Enter y2: ");
        int y2=sc.nextInt();

        System.out.print("Enter x3: ");
        int x3=sc.nextInt();
        System.out.print("Enter y3: ");
        int y3=sc.nextInt();

        System.out.println("By slope: "+checkBySlope(x1,y1,x2,y2,x3,y3));
        System.out.println("By area: "+checkByArea(x1,y1,x2,y2,x3,y3));
    }
}
