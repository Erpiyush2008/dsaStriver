import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create 2D ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Adding rows
        for (int i = 0; i < rows; i++) {

            // Create inner ArrayList for each row
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                row.add(sc.nextInt());
            }

            // Add row to matrix
            matrix.add(row);
        }

        // Printing matrix
        System.out.println("\nMatrix is:");

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}