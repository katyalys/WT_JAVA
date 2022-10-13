package task3;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a, b, h: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int h = in.nextInt();
            in.close();

            for (int i = a; i <= b; i += h) {
                int x = i;
                double f = Math.tan(x);
                System.out.println("x = " + x + "  |  F(x) = " + f);
            }
        }
}
