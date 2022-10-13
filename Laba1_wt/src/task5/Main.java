package task5;

import IOServices.Reader.Implement.ConsoleReader;
import IOServices.Writer.Implement.ConsoleWriter;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();

        writer.WriteLn("Size of the array" + ":");
        var sizeMas = reader.ReadInt();

        var mas = new int[sizeMas];
        for (int i = 0; i < mas.length; i++) {
            writer.WriteLn("Input element " + (i + 1) + ":");
            mas[i] = reader.ReadInt();
        }

        writer.WriteLn(delElements(mas) + " - element to remove");
    }

    public static int delElements(int[] sequence) {
        int currLength;
        boolean flag;
        int maxLengthSequence = 0;

        for (int i = 0; i < sequence.length; i++) {
            flag = true;
            currLength = 1;
            for (int j = i + 1; (j < sequence.length) && flag; j++) {
                if (sequence[j - 1] < sequence[j]) {
                    currLength++;
                } else {
                    flag = false;
                }
            }
            maxLengthSequence = Math.max(maxLengthSequence, currLength);
        }
        return sequence.length - maxLengthSequence;
    }
}

