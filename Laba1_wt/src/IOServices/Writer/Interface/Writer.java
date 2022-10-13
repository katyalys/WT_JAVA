package IOServices.Writer.Interface;

public interface Writer {
    void Write(String str);

    void WriteLn(String str);

    void WriteF(String format, Object... args);
}