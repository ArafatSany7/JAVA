
import java.util.Scanner;

public class array2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Input number of collumn : ");
        int col = sc.nextInt();

        int number[][] = new int[rows][col];
        // Row elements
        for (int i = 0; i < rows; i++) {
            System.out.println("Input elemnts for " + i + "row");
            // Col elements
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("===Ouput of 2D matrix===");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

    }
}
