package task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = in.nextInt();
        int[] array = new int[n];
        fillArray(array);
        sortArray(array);
        in.close();
    }

    private static void fillArray(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fill array: ");
        for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt();
        }
    }

    private static void sortArray(int[] array){
        //Shell Sorting
        int i = 0;
        while(i < array.length - 1){
            if(array[i] <= array[i + 1])
                i++;
            else{
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if(i != 0)
                    i--;
            }
        }
        printArr(array);
    }

    private static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}