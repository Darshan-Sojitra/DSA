import java.util.*;

public class productandsum {
    static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        // Calculate product and sum of digits
        while (n != 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {

        // positive number
        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        int number = sc.nextInt();

        int result = subtractProductAndSum(number);

        System.out.println("Result: " + result);
    }
}
