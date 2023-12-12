import java.util.*;

//Define a program to find out whether a given number is even or odd.
public class evenorodd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");

        } else {
            System.out.println("The number is odd");
        }
    }

}
