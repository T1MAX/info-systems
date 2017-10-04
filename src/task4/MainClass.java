package task4;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by 803019 on 04.10.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stream_Scanner stream_scanner = new Stream_Scanner(scanner);

        System.out.println("Enter the numbers (not integer number = stop):");

        stream_scanner.toIntStream().forEach(System.out::println);

        System.out.println("Enter the double numbers (not double number = stop):");

        stream_scanner.toDoubleStream().forEach(System.out::println);

        System.out.println("Enter the words (0 = stop):");

        stream_scanner.toWordStream().forEach(System.out::println);

        System.out.println("Enter the lines (0 = stop):");

        stream_scanner.toLineStream().forEach(System.out::println);

    }
}
