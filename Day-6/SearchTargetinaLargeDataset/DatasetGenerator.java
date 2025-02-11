public class DatasetGenerator {
    // Generates a sorted dataset of size 'n'
    public static int[] generateSortedDataset(int n) {
        int[] dataset = new int[n];
        for (int i = 0; i < n; i++) {
            dataset[i] = i; // Sorted data from 0 to size-1
        }
        return dataset;
    }
}
