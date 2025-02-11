public class StringConcat {
    public static void concatenate(int N) {
        String result = "";
        for (int i = 0; i < N; i++) {
            result += "a"; // Creates a new object each time
        }
    }
}
