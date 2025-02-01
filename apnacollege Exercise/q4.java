
import java.util.Scanner;

public class q4 {

    public static double radious(int i) {
        double redo = (2 * 3.1416) * i;
        return redo;
    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of the circle : ");
        i = sc.nextInt();

        System.out.println("The cercumference of cirle is : " + radious(i));

    }
}
