package workshop1;

import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        int rows;
        int cols;
        double matrix[][];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        rows = input.nextInt();
        System.out.println("Enter number of columns: ");
        cols = input.nextInt();

        matrix = new double[rows][cols];
        System.out.println("Enter the matrix's entries: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter entry " + i + ", " + j + "  ");
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println("Inputted matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%.2f", matrix[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        
        input.close();
    }
}
