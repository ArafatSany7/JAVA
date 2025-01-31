
import java.util.Scanner;

public class q3 {

    public static int comp(int i, int j) {
        int max = Math.max(i, j);
        return max;
    }

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first two integer: ");
        i = sc.nextInt();
        j = sc.nextInt();

        System.out.println("Maximum number is : " + comp(i, j));

    }
}
