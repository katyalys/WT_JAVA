package IOServices.Writer.Implement;

import IOServices.Writer.Interface.Writer;

public class ConsoleWriter implements Writer {
    private static ConsoleWriter instance;

    private ConsoleWriter() {
    }

    public static ConsoleWriter getInstance() {
        if (instance == null) {
            instance = new ConsoleWriter();
        }
        return instance;
    }

    @Override
    public void Write(String str) {
        System.out.print(str);
    }

    @Override
    public void WriteLn(String str) {
        System.out.println(str);
    }

    @Override
    public void WriteF(String format, Object... args) {
        System.out.printf(format, args);
    }
}
