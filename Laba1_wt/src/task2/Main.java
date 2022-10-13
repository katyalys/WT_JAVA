package task2;

import IOServices.Reader.Implement.ConsoleReader;
import IOServices.Writer.Implement.ConsoleWriter;
import task2.Implement.GeneralArea;
import task2.Implement.RectArea;
import task2.Interface.Area;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();
        Area taskArea = new GeneralArea(
                new RectArea(-4, 0, 8, 5),
                new RectArea(-6, -3, 12, 3)
        );

        writer.WriteLn("Input x:");
        var x = reader.ReadDouble();

        writer.WriteLn("Input y:");
        var y = reader.ReadDouble();

        writer.WriteLn("Point " + (taskArea.contains(x, y) ? "in" : "not in") + " area");
    }
}