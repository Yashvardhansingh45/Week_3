import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        Random random = new Random();

        for (int size : datasetSizes) {
            // Generate a sorted dataset
            int[] dataset = DatasetGenerator.generateSortedDataset(size);

            // Pick a random target
            int target = dataset[random.nextInt(size)];

            // Measure Linear Search time
            long startLinear = System.nanoTime();
            LinearSearch.search(dataset, target);
            long endLinear = System.nanoTime();

            // Measure Binary Search time
            long startBinary = System.nanoTime();
            BinarySearch.search(dataset, target);
            long endBinary = System.nanoTime();

            // Print results
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");
            System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");
            System.out.println("-------------------------------------");
        }
    }
}
