package task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = in.nextInt();
        int[] array = new int[n];
        fillArray(array);
        createMatrix(array);
        in.close();
    }

    private static void fillArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fill array: ");
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }
    }

    private static void createMatrix(int[] array) {
        int[][] matrix = new int[array.length][array.length];
        int step = 0;

        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = array[(j + step) % array.length];
            }
            step++;
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            for (int j = 0; j < matrix.length; j++){
                System.out.print(line[j] + " ");
            }
            System.out.println();
        }
    }
}