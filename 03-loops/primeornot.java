import java.util.*;

// Write a function that returns all prime numbers between two given numbers.
public class primeornot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Fist number");
        int number = sc.nextInt();

        System.out.print("Second number");
        int number2 = sc.nextInt();

        List<Integer> primes = primecheck(number, number2);

        System.out.println("Prime numbers between " + number + " and " + +number2 + " : " + primes);

    }

    static List<Integer> primecheck(int n1, int n2) {
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        List<Integer> primes = new ArrayList<>();
        for (int number = n1; number <= n2; number++) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
