package task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter size, n = ");
        int n = str.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "] element ");
            intArray[i] = str.nextInt();
        }
        str.close();

        System.out.println("Prime numbers: ");
        int f = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;

            for (int j = 2; j <= Math.sqrt(intArray[i]); j++) {
                if (intArray[i] % j == 0) {
                    temp = 1;
                }
            }
            if (temp == 0) {
                f = 1;
                System.out.print(intArray[i] + " ");
            }
        }
        if (f==0) System.out.println("There are no prime numbers :(");
    }
}