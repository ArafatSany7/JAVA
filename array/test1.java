
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 96;o
        // marks[2] = 43;
        // int[] marks = {97, 95, 92};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] marks = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (marks[i] == x) {
                System.out.println("X found at index : " + i);
            }
        }
    }
}
