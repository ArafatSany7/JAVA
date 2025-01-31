
import java.util.Scanner;

// Enter 3 number from user and make a fuction to print their avarage
public class practise4 {

    public static float avarage(float num1, float num2, float num3) {
        float avarage = (num1 + num2 + num3) / 3;

        return avarage;

    }

    public static void main(String[] args) {

        int num1, num2, num3;

        System.out.println("Please intput three number for making avarage: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.println("Avarage of the some of three numbers: " + avarage(num1, num2, num3));

    }
}
