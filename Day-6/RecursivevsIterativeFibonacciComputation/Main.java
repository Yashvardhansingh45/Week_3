public class Main {
    public static void main(String[] args) {
        int N = 40;

        System.out.println("Testing Fibonacci Computation...");

        long startRec = System.nanoTime();
        int fibRec = FibonacciRecursive.compute(N);
        long endRec = System.nanoTime();
        System.out.println("Recursive Fibonacci (" + N + "): " + fibRec + " Time: " + (endRec - startRec) / 1_000_000 + " ms");

        long startIter = System.nanoTime();
        int fibIter = FibonacciIterative.compute(N);
        long endIter = System.nanoTime();
        System.out.println("Iterative Fibonacci (" + N + "): " + fibIter + " Time: " + (endIter - startIter) / 1_000_000 + " ms");
    }
}
