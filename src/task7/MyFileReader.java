package task7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class MyFileReader {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.lines(Paths.get(args[0])).collect(Collectors.toList());
        printLines(lines, Integer.valueOf(args[1]));
    }

    static void printLines(List<String> list, int numberOfLines) {
        Collections.shuffle(list);
        for (int i = 0; i < numberOfLines && i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
