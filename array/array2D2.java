
import java.util.Scanner;

public class array2D2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of row : ");
        int row = sc.nextInt();

        System.out.print("input number of Collimn : ");
        int col = sc.nextInt();

        int mat[][] = new int[row][col];

        // loop for row elements
        for (int i = 0; i < row; i++) {
            System.out.print("Enter elements for " + i + " number row: ");
            // loop for each elements of row/collumn
            for (int j = 0; j < col; j++) {

                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // search number
        System.out.print("input desire Number : ");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == x) {
                    System.out.println("X found at loacation (" + i + "," + j + ")");
                }
            }
        }

    }
}
