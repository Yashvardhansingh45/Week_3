import java.util.HashSet;

public class HashSetSearch {
    public static boolean search(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        return set.contains(target);
    }
}
