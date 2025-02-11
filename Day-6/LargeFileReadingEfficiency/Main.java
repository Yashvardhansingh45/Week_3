import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("largefile.txt"); // Replace with actual large file path

        System.out.println("Testing Large File Reading...");

        long startFR = System.nanoTime();
        FileReaderTest.readFile(file);
        long endFR = System.nanoTime();
        System.out.println("FileReader Time: " + (endFR - startFR) / 1_000_000 + " ms");

        long startISR = System.nanoTime();
        InputStreamReaderTest.readFile(file);
        long endISR = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (endISR - startISR) / 1_000_000 + " ms");
    }
}
