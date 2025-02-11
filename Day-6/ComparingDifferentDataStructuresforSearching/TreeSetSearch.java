import java.util.TreeSet;

public class TreeSetSearch {
    public static boolean search(int[] arr, int target) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) set.add(num);
        return set.contains(target);
    }
}
