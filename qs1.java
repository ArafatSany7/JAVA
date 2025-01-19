
import java.util.Scanner;

public class qs1 {

    public static void main(String[] args) {

        // Input part
        System.out.print("Enter value for a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter value for b : ");
        int b = sc.nextInt();

        // summation Part
        int sum = a + b;

        System.out.print("Summation of two Number:");

        System.out.println(sum);

        // Condition part
        if (a > b) {
            System.out.println("A is sinior vai");
        } else {
            System.out.println("B is senior vai");
        }

        System.out.println("Now we check weather the number is odd or even");

        if (a % 2 == 0) {
            System.out.println("A Mingle");
        } else {
            System.out.println("A Single sobar motoi");
        }

        // Switch case
        System.out.println("\n");
        System.out.println("=======Now will use Switch case========");

        System.out.print("Enter a value for button: ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hoise mama");

                break;
            case 2:
                System.out.println("Eibar o hoice");
                break;
            case 3:
                System.out.println("Are nice eibar o hoiche");
                break;
            default:
                System.out.println("Eida kono kotha :( ");
        }

        System.out.println("======Loop start here========");

    }
}
