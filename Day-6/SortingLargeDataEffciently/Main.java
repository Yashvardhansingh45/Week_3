import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        Random random = new Random();

        for (int size : datasetSizes) {
            // Generate a random dataset
            int[] dataset = DatasetGenerator.generateRandomDataset(size);

            // Copy arrays for fair comparison
            int[] datasetBubble = dataset.clone();
            int[] datasetMerge = dataset.clone();
            int[] datasetQuick = dataset.clone();

            System.out.println("Dataset Size: " + size);

            // Measure Bubble Sort
            long startBubble = System.nanoTime();
            BubbleSort.sort(datasetBubble);
            long endBubble = System.nanoTime();
            System.out.println("Bubble Sort Time: " + (endBubble - startBubble) / 1_000_000 + " ms");

            // Measure Merge Sort
            long startMerge = System.nanoTime();
            MergeSort.sort(datasetMerge, 0, datasetMerge.length - 1);
            long endMerge = System.nanoTime();
            System.out.println("Merge Sort Time: " + (endMerge - startMerge) / 1_000_000 + " ms");

            // Measure Quick Sort
            long startQuick = System.nanoTime();
            QuickSort.sort(datasetQuick, 0, datasetQuick.length - 1);
            long endQuick = System.nanoTime();
            System.out.println("Quick Sort Time: " + (endQuick - startQuick) / 1_000_000 + " ms");

            System.out.println("-------------------------------------");
        }
    }
}
