package IOServices.Reader.Implement;
import IOServices.Reader.Interface.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private static ConsoleReader instance;

    private final Scanner scanner;

    private ConsoleReader() {
        this.scanner = new Scanner(System.in);
    }

    public static ConsoleReader getInstance() {
        if (instance == null) {
            instance = new ConsoleReader();
        }
        return instance;
    }

    @Override
    public double ReadDouble() {
        boolean isValid = false;
        double number = 0.0;

        while (!isValid) {
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                isValid = true;
            } else {
                scanner.nextLine();
            }
        }
        return number;
    }

    @Override
    public int ReadInt() {
        boolean isValid = false;
        int number = 0;

        while (!isValid) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                isValid = true;
            } else {
                scanner.nextLine();
            }
        }
        return number;
    }
}