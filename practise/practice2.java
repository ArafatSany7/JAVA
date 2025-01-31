
import java.util.Scanner;

public class practice2 {

    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.print("Enter 2 number : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("calculated product of 2 number : " + product(a, b));
    }
}
