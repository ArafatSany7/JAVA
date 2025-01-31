
import java.util.Scanner;

// write a function to print the sum of all odd number from 1 to n;
public class practise5 {

    public static int odd(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int n;

        System.out.print("Print the length of Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Sum of all odd Number: " + odd(n));
    }
}
