import java.util.*;

public class lcm_hcf {

    private static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula LCM(a, b) = abs(a * b) / HCF(a,
    // b)
    private static int calculateLCM(int a, int b, int hcf) {
        return Math.abs(a * b) / hcf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate HCF and LCM
        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2, hcf);

        // Display the results
        System.out.println("HCF of " + num1 + " and " + num2 + ": " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm);

        scanner.close();

    }

}
