
import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fibonacci limit : ");
        n = sc.nextInt();

        System.out.println("Fibonacci series from 0 to " + n + " are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }

    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;

        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
