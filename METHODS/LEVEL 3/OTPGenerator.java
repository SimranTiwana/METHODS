import java.util.Scanner;

public class OTPGenerator {

    static int[] otps = new int[10];

    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000); 
    }

    public static boolean areUnique() {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        boolean unique = areUnique();
        System.out.println("All OTPs unique? " + unique);
    }
}
