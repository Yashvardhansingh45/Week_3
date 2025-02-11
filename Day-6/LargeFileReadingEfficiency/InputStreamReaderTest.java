import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void readFile(File file) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file))) {
            while (isr.read() != -1) {} // Read bytes and convert to characters
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
