package task8;


import java.util.Scanner;
import java.util.stream.Stream;

public class RandomStreamCreator {
    private final static long a = 25214903917L;
    private static final int c = 11;
    private static final long m = (long)Math.pow(2, 48);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the seed of numbers: ");
        int seed = scanner.nextInt();
        Stream<Long> randomNumbers = Stream.iterate((long)seed, n -> (a * n + c) % m);

        randomNumbers.limit(10).forEach(System.out::println);

    }
}
