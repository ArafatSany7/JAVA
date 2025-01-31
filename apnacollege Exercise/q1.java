
import java.util.Scanner;

public class q1 {

    public static float avr(float num1, float num2, float num3) {
        float avarage = (num1 + num2 + num3) / 3;
        return avarage;
    }

    public static void main(String[] args) {
        float num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        num3 = sc.nextInt();

        System.out.println("Avarage of three number : " + avr(num1, num2, num3));

    }

}
