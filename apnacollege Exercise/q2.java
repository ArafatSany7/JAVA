
import java.util.Scanner;

public class q2 {

    public static int oddsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of integer: ");
        n = sc.nextInt();

        System.out.println("Sum of all oddNumber from 1 to " + n + " is: " + oddsum(n));
    }
}
