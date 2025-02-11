public class Main {
    public static void main(String[] args) {
        int N = 1_000_000; // Number of concatenations

        System.out.println("Testing String Concatenation Performance...");

        long startString = System.nanoTime();
        StringConcat.concatenate(N);
        long endString = System.nanoTime();
        System.out.println("String Time: " + (endString - startString) / 1_000_000 + " ms");

        long startSB = System.nanoTime();
        StringBuilderConcat.concatenate(N);
        long endSB = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endSB - startSB) / 1_000_000 + " ms");

        long startSBuffer = System.nanoTime();
        StringBufferConcat.concatenate(N);
        long endSBuffer = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endSBuffer - startSBuffer) / 1_000_000 + " ms");
    }
}
