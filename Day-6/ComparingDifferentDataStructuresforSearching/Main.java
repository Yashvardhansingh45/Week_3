import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = 1_000_000;
        int[] dataset = new int[N];
        for (int i = 0; i < N; i++) dataset[i] = i;
        int target = new Random().nextInt(N);

        System.out.println("Testing Data Structure Searching...");

        long startArr = System.nanoTime();
        ArraySearch.search(dataset, target);
        long endArr = System.nanoTime();
        System.out.println("Array Search Time: " + (endArr - startArr) / 1_000_000 + " ms");

        long startHashSet = System.nanoTime();
        HashSetSearch.search(dataset, target);
        long endHashSet = System.nanoTime();
        System.out.println("HashSet Search Time: " + (endHashSet - startHashSet) / 1_000_000 + " ms");

        long startTreeSet = System.nanoTime();
        TreeSetSearch.search(dataset, target);
        long endTreeSet = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (endTreeSet - startTreeSet) / 1_000_000 + " ms");
    }
}
