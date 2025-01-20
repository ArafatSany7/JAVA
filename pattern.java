
import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.print("input value for m: ");

        m = sc.nextInt();

        System.out.print("input value for n: ");
        n = sc.nextInt();

        System.out.println("========Ractangular========");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }

        System.out.println("====== Hole ractanguler ======");
        //   n=4      m=5
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("=====Half pyramid=======");

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====reverse half pyramid======");

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("=======Inverted half pyramid========");

        for (int i = 0; i <= n; i++) {
            // first inner lopp for spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            // second inner loop for *
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println('*');
        }

    }
}
