package laba1.company;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import IOServices.Reader.Implement.ConsoleReader;
import IOServices.Writer.Implement.ConsoleWriter;
import task1.math.CalculateFunction;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ConsoleWriter writer = ConsoleWriter.getInstance();
        ConsoleReader reader = ConsoleReader.getInstance();
        CalculateFunction calculator = new CalculateFunction();
        writer.WriteLn("Input x:");
        double x = reader.ReadDouble();
        writer.WriteLn("Input y:");
        double y = reader.ReadDouble();
        double var10001 = calculator.calculate(x, y);
        writer.WriteLn("Result = " + var10001);

    }
}

