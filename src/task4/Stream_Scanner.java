package task4;

import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by 803019 on 04.10.2017.
 */
public class Stream_Scanner {
    private Scanner scanner;

    public Stream_Scanner (Scanner scanner) {
        this.scanner = scanner;
    }

    public Stream<Integer> toIntStream() {
        ArrayList<Integer> numbers = new ArrayList<>();
        while(this.scanner.hasNextInt()) {
            numbers.add(this.scanner.nextInt());
        }
        scanner.next();
        return Stream.of(numbers.toArray(new Integer[numbers.size()]));
    }

    public Stream<Double> toDoubleStream() {
        ArrayList<Double> numbers = new ArrayList<>();
        while(this.scanner.hasNextDouble()) {
            numbers.add(this.scanner.nextDouble());
        }
        scanner.next();
        return Stream.of(numbers.toArray(new Double[numbers.size()]));
    }

    public Stream<String> toWordStream() {
        ArrayList<String> numbers = new ArrayList<>();
        String str;
        while(!(str = this.scanner.next()).equals("0")) {
            numbers.add(str);
        }
        return Stream.of(numbers.toArray(new String[numbers.size()]));
    }

    public Stream<String> toLineStream() {
        ArrayList<String> numbers = new ArrayList<>();
        String str;
        while(!(str = this.scanner.nextLine()).equals("0")) {
            numbers.add(str);
        }
        return Stream.of(numbers.toArray(new String[numbers.size()]));
    }
}
