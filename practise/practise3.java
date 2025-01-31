
import java.util.Scanner;

// Find factorial
public class practise3 {

    public static int factorialNumber(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        System.out.print("Input number for factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Factorial of Number : " + factorialNumber(n));

    }
}
