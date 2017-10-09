package task9;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCombiner {
    public static void main(String[] args) {
        Stream first = Stream.builder().add(1).add(3).add(9).build();
        Stream second = Stream.builder().add(2).add(4).add(6).add(8).build();

        zip(first, second).forEach(System.out::println);
    }

    public static Stream zip(Stream first, Stream second) {
        Object[] firstArray = first.toArray();
        Object[] secondArray = second.toArray();
        Object[] resultArray = new Object[Math.min(firstArray.length, secondArray.length) * 2];
        for (int i = 0, j = 0; i < resultArray.length - 1 && j < Math.min(firstArray.length, secondArray.length); i += 2, j++) {
            resultArray[i] = firstArray[j];
            resultArray[i + 1] = secondArray[j];
        }
        return Arrays.stream(resultArray);
    }
}
