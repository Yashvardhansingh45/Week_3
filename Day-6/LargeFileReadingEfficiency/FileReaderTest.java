import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void readFile(File file) {
        try (FileReader fr = new FileReader(file)) {
            while (fr.read() != -1) {} // Read character by character
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
