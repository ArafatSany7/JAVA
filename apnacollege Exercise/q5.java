
import java.util.Scanner;

public class q5 {

    public static String eligible(int age) {
        if (age > 18) {
            return "You are eligible";
        } else {
            return "You are not eligible";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter your age : ");
        age = sc.nextInt();

        System.out.println(eligible(age));

    }
}
