
import java.util.Scanner;

public class q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer limit: ");
        int size = sc.nextInt();

        System.out.print("Enter string: ");
        String name[] = new String[size];

        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }

        for (int i = 0; i < name.length; i++) {

            System.out.println("name " + (i + 1) + " is : " + name[i]);
        }
    }
}
