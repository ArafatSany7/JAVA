
import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        int positive = 0, negative = 0, zero = 0, n, number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit of number: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zero);
    }
}
