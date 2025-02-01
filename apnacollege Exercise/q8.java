
import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        x = sc.nextInt();
        System.out.print("Enter second integer: ");
        y = sc.nextInt();

        System.out.println(pow(x, y));
    }

    public static double pow(int x, int y) {
        double power = Math.pow(x, y);
        return power;
    }

}
