import java.util.Random;

public class DatasetGenerator {
    // Generates an array of random integers
    public static int[] generateRandomDataset(int n) {
        int[] dataset = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            dataset[i] = random.nextInt(n); // Values between 0 and n-1
        }
        return dataset;
    }
}
